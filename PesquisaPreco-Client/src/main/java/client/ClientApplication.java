package client;

import generated.wsimport.*;
//import ui.*;
import java.util.ArrayList;

public class ClientApplication {
	public static void main(String[] args) throws IOException_Exception {
		MarketplaceEndpointService m_service = new MarketplaceEndpointService();
		MarketplaceEndpoint m_endpoint = m_service.getMarketplaceEndpointPort();
		GroceriesListEndpointService l_service = new GroceriesListEndpointService();
		GroceriesListEndpoint l_endpoint = l_service.getGroceriesListEndpointPort();
		ProductEndpointService p_service = new ProductEndpointService();
		ProductEndpoint p_endpoint = p_service.getProductEndpointPort();
		SearchPricesEndpointService s_service = new SearchPricesEndpointService();
		SearchPricesEndpoint s_endpoint = s_service.getSearchPricesEndpointPort();
		
		Marketplace m = new Marketplace();
		m.setName("Nordestão Ponta Negra");
		m.setAddress("Av. Engenheiro Roberto Freire, nº 0, Capim Macio");
		m.setContact("@nordestao");
		m.setOpening("06:00 - 22:00");
		
		Marketplace n = new Marketplace();
		n.setName("Nordestão Cidade Jardim");
		n.setAddress("Av. Engenheiro Roberto Freire, nº 1, Capim Macio");
		n.setContact("@nordestao");
		n.setOpening("06:00 - 22:00");
		
		m_endpoint.registerMarket(n);
		m_endpoint.registerMarket(m);
		m_endpoint.deleteMarket(m);
		
		Product p = new Product();
		p.setName("Arroz Branco Parbolizado");
		p.setBrand("Tio João");
		p.setMeasure("1kg");
		p.setPrice(5.99);

		p_endpoint.registerProduct(p);
		
		ArrayList<String> prods = new ArrayList<String>();
		prods.add("Arroz Branco Parbolizado");
		l_endpoint.registerItemsToGroceriesList(prods);
		
		String obj = s_endpoint.searchBestOffers();
		System.out.println(obj);
	}
}
