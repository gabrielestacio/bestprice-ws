package client;

import generated.wsimport.*;
//import ui.*;
import java.util.ArrayList;

public class ClientApplication {
	public static void main(String[] args) throws IOException_Exception {
		System.out.println("BEM VINDO AO PESQUISA DE PREÇOS");
		
		MarketplaceEndpointService m_service = new MarketplaceEndpointService();
		MarketplaceEndpoint m_endpoint = m_service.getMarketplaceEndpointPort();
		GroceriesListEndpointService l_service = new GroceriesListEndpointService();
		GroceriesListEndpoint l_endpoint = l_service.getGroceriesListEndpointPort();
		ProductEndpointService p_service = new ProductEndpointService();
		ProductEndpoint p_endpoint = p_service.getProductEndpointPort();
		SearchPricesEndpointService s_service = new SearchPricesEndpointService();
		SearchPricesEndpoint s_endpoint = s_service.getSearchPricesEndpointPort();
		
		Marketplace nordestao = new Marketplace();
		nordestao.setName("Nordestão Lagoa Nova");
		nordestao.setAddress("Av. Senador Salgado Filho, s/nº, Lagoa Nova - Natal");
		nordestao.setContact("@nordestao");
		nordestao.setOpening("06:00 - 22:00");
		
		Product n_cafe = new Product();
		n_cafe.setName("Café Preto Extraforte");
		n_cafe.setBrand("Melita");
		n_cafe.setMeasure("500g");
		n_cafe.setPrice(5);
		
		Marketplace atacadao = new Marketplace();
		atacadao.setName("Atacadão Lagoa Nova");
		atacadao.setAddress("Av. Prudente de Morais, s/nº, Lagoa Nova - Natal");
		atacadao.setContact("@atacadao");
		atacadao.setOpening("06:00 - 22:00");
		
		Product a_cafe = new Product();
		a_cafe.setName("Café Preto Extraforte");
		a_cafe.setBrand("Três Corações");
		a_cafe.setMeasure("500g");
		a_cafe.setPrice(6);
		
		Marketplace favorito = new Marketplace();
		favorito.setName("Favorito Capim Macio");
		favorito.setAddress("Av. Engenheiro Roberto Freire, s/nº, Capim Macio - Natal");
		favorito.setContact("@favorito");
		favorito.setOpening("06:00 - 22:00");
		
		Product f_cafe = new Product();
		f_cafe.setName("Café Preto Extraforte");
		f_cafe.setBrand("Santa Clara");
		f_cafe.setMeasure("500g");
		f_cafe.setPrice(5.5);
		
		ArrayList<String> groceries = new ArrayList<String>();
		groceries.add("Café Preto Extraforte");
		
		//m_endpoint.registerMarket(nordestao);
		//p_endpoint.registerProduct(n_cafe);

		//m_endpoint.registerMarket(atacadao);
		//p_endpoint.registerProduct(a_cafe);

		//m_endpoint.registerMarket(favorito);
		//p_endpoint.registerProduct(f_cafe);
		
		//p_endpoint.deleteProduct(f_cafe);
		//m_endpoint.deleteMarket(favorito);

		//l_endpoint.registerNewGroceriesList(groceries);
		
		String offers = s_endpoint.searchBestOffers();
		System.out.println(offers);
	}
}
