package repository;

import java.io.IOException;
import java.util.ArrayList;
import model.*;
import org.json.*;

public interface StorageInterface{
		public void saveNewList(ArrayList<String> groceries) throws IOException;
		public void saveItemsToList(ArrayList<String> groceries) throws IOException;
		public void saveMarket(Marketplace market) throws IOException;
		public void saveProduct(Product p) throws IOException;
		public ArrayList<String> loadList();
		public Marketplace loadMarketplace(String name);
		public ArrayList<Product> loadProducts(String name);
		public void deleteList() throws IOException;
		public void deleteMarketplace(String name) throws IOException;
		public void deleteProduct(String name) throws IOException;
		public JSONObject searchByName(Key key, String name);
		public JSONArray searchProductByName(String name);
		public String searchBestOffers();
}