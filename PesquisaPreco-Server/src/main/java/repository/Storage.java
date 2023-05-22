package repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import model.*;
import org.json.*;

public class Storage implements StorageInterface{
	private static Storage instance;
	private JSONTokener tokener;
	private FileReader reader;
	private FileWriter writer;
	private JSONObject data;
	
	private Storage() throws IOException {
		BufferedReader buffer;
    	
    	//Verifica se o arquivo Data.json já existe. Se não existir, cria um novo.
    	try {
    		reader = new FileReader("./src/main/java/repository/Data.json");
    	} catch (FileNotFoundException e) {
    		File file = new File("./src/main/java/repository/Data.json");
    		file.createNewFile();
    		reader = new FileReader("./src/main/java/repository/Data.json");
    	}
    	
    	writer = new FileWriter("./src/main/java/repository/Data.json");
    	tokener = new JSONTokener(reader);

    	//Verificar se o arquivo Data.json está vazio. Se não estiver, o JSONObject é criado com o conteúdo já presente em Data.json.
    	buffer = new BufferedReader(new FileReader("./src/main/java/repository/Data.json"));
    	if(buffer.readLine() == null) {
    		data = new JSONObject();
    		data.put("mercados", new JSONArray());
    		data.put("produtos", new JSONArray());
    		data.put("usuarios", new JSONArray());
    		data.put("lista", new JSONArray());
    		writer.write(data.toString());
    		writer.flush();
    	} else {
    		data = new JSONObject(tokener);
    	}
    	
    	buffer.close();
	}
	
	public static Storage getInstanceOf() throws IOException {
		if(instance == null) {
			instance = new Storage();
		}
		return instance;
	}
	
	public void saveNewList(ArrayList<String> groceries) throws IOException {
		writer = new FileWriter("./src/main/java/repository/Data.json");
		data.getJSONArray("lista").clear();
		
		for(int i = 0; i < groceries.size(); i++) {
			data.getJSONArray("lista").put(groceries.get(i));
		}
		writer.write(data.toString());
		writer.flush();
	}
	
	public void saveItemsToList(ArrayList<String> groceries) throws IOException {
		writer = new FileWriter("./src/main/java/repository/Data.json");
		
		for(int i = 0; i < groceries.size(); i++) {
			data.getJSONArray("lista").put(groceries.get(i));
		}
		writer.write(data.toString());
		writer.flush();
	}
	
	public void saveMarket(Marketplace market) throws IOException {
		JSONObject temp = searchByName(Key.MARKETPLACE, market.getName());
		
		if(temp == null) {
			temp = new JSONObject();
			temp.put("id", data.getJSONArray("mercados").length());
			temp.put("nome", market.getName());
			temp.put("endereco", market.getAddress());
			temp.put("contato", market.getContact());
			temp.put("funcionamento", market.getOpening());
			writer = new FileWriter("./src/main/java/repository/Data.json");
			data.getJSONArray("mercados").put(temp);
			writer.write(data.toString());
			writer.flush();
		}
	}
	
	public void saveProduct(Product p) throws IOException {
		JSONObject temp = searchByName(Key.PRODUCT, p.getName());
		
		if(temp == null) {
			temp = new JSONObject();
			temp.put("id", data.getJSONArray("produtos").length());
			temp.put("nome", p.getName());
			temp.put("marca", p.getBrand());
			temp.put("medida", p.getMeasure());
			temp.put("id_mercado", data.getJSONArray("mercados").length() - 1);
			temp.put("preco", p.getPrice());
			writer = new FileWriter("./src/main/java/repository/Data.json");
			data.getJSONArray("produtos").put(temp);
			writer.write(data.toString());
			writer.flush();
		}
	}
	
	public ArrayList<String> loadList(){
		ArrayList<String> list = new ArrayList<String>();
		JSONArray groceries = data.getJSONArray("lista");
		
		if(groceries.isEmpty()) {
			return null;
		}
		
		for(int i =0; i < groceries.length(); i++) {
			list.add(groceries.getString(i));
		}
		
		return list;
	}
	
	public Marketplace loadMarketplace(String name) {
		Marketplace market;
		JSONObject info = searchByName(Key.MARKETPLACE, name);
		JSONObject m = new JSONObject();
		
		if(!info.isEmpty()) {
			m = data.getJSONArray("mercados").getJSONObject(info.getInt("id"));
		}
		System.out.println(m.toString());
		market = new Marketplace(m.getString("nome"), m.getString("endereco"), m.getString("contato"), m.getString("funcionamento"));
		market.setId(info.getInt("id"));
		return market;
	}
	
	public ArrayList<Product> loadProducts(String name) {
		ArrayList<Product> products = new ArrayList<Product>();
		JSONArray info = searchProductByName(name);
		JSONObject p = new JSONObject();
		Product prod = new Product();
		int index = 0;		
		
		if(!info.isEmpty()) {
			for(int i = 0; i < info.length(); i++) {
				index = info.getInt(i);
				p = data.getJSONArray("produtos").getJSONObject(index);			}
				prod = new Product(p.getString("nome"), p.getString("marca"), p.getString("medida"), p.getDouble("price"));
				prod.setId(index);
				prod.setMarketId(data.getJSONArray("mercados").length() - 1);
				products.add(prod);
		}
		
		return products;
	}
	
	public void deleteList() throws IOException {
		writer = new FileWriter("./src/main/java/repository/Data.json");
		data.getJSONArray("lista").clear();
		writer.write(data.toString());
		writer.flush();
	}
	
	public void deleteMarketplace(String name) throws IOException {
		JSONObject info = searchByName(Key.MARKETPLACE, name);
		
		if(!info.isEmpty()) {
			writer = new FileWriter("./src/main/java/repository/Data.json");
			data.getJSONArray("mercados").remove(info.getInt("id"));
			for(int i = 0; i < data.getJSONArray("mercados").length(); i++) {
				data.getJSONArray("mercados").getJSONObject(i).put("id", i);
			}
			writer.write(data.toString());
			writer.flush();
		}
	}
	
	public void deleteProduct(String name) throws IOException {
		JSONArray info = searchProductByName(name);
		
		if(!info.isEmpty()) {
			writer = new FileWriter("./src/main/java/repository/Data.json");
			for(int i = 0; i < info.length(); i++) {
				data.getJSONArray("produtos").remove(info.getInt(i));
			}
			for(int j = 0; j < data.getJSONArray("produtos").length(); j++) {
				data.getJSONArray("produtos").getJSONObject(j).put("id", j);
			}
			writer.write(data.toString());
			writer.flush();
		}
	}
	
	public JSONObject searchByName(Key key, String name) {
		JSONArray list;
		JSONObject info = new JSONObject();
		
		if(key == Key.MARKETPLACE) {
			list = data.getJSONArray("mercados");
			for(int i = 0; i < list.length(); i++) {
				if(name.equals(list.getJSONObject(i).getString("nome"))) {
					info.put("id", i);
					return info;
				}
			}
		} else if(key == Key.LIST) {
			list = data.getJSONArray("lista");
			for(int i = 0; i < list.length(); i++) {
				if(name.equals(list.get(i))) {
					JSONObject temp = new JSONObject();
					temp.put("id", i);
					return temp;
				}
			}
		}
		
		return null;
	}

	public JSONArray searchProductByName(String name) {
			JSONArray products = new JSONArray();
			JSONArray list = data.getJSONArray("produtos");
			for(int i = 0; i < list.length(); i++) {
				if(name.equals(list.getJSONObject(i).getString("nome"))) {
					products.put(list.getJSONObject(i).getInt("id"));
				}
			}
			return products;
	}
	
	public String searchBestOffers() {
		JSONObject result = new JSONObject();
		JSONArray offers = new JSONArray();
		JSONArray markets = new JSONArray();
		JSONArray markets_per_product = new JSONArray();
		JSONArray list = data.getJSONArray("lista");
		JSONArray products = new JSONArray();
		JSONObject best_offer = new JSONObject();
		String market_name = new String();
		int index = 0;
		
		for(int i = 0; i < list.length(); i++) {
			products = searchProductByName(list.getString(i));
			best_offer = data.getJSONArray("produtos").getJSONObject(products.getInt(0));
			index = data.getJSONArray("produtos").getJSONObject(products.getInt(0)).getInt("id_mercado");
			System.out.println("cheguei");
			market_name = data.getJSONArray("mercados").getJSONObject(index).getString("nome");
			markets_per_product.put(market_name);
			System.out.println("passei");
			for(int j = 1; j < products.length(); j++) {
				index = data.getJSONArray("produtos").getJSONObject(products.getInt(j)).getInt("id_mercado");
				market_name = data.getJSONArray("mercados").getJSONObject(index).getString("nome");
				markets_per_product.put(market_name);
				if(best_offer.getDouble("preco") > data.getJSONArray("produtos").getJSONObject(products.getInt(j)).getDouble("preco")) {
					best_offer = data.getJSONArray("produtos").getJSONObject(products.getInt(j));
				}
			}
			markets.put(markets_per_product);
			offers.put(best_offer);
			products.clear();
			markets_per_product.clear();
			best_offer.clear();
		}
		
		result.put("melhores ofertas", offers);
		result.put("mercados consultados", markets);
		
		return result.toString();
	}
}