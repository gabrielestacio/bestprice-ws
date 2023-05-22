package server;
import java.io.IOException;

import javax.xml.ws.Endpoint;

import endpoint.*;

public class ServerApplication{
	public static void main(String[] args) throws IOException {
		System.out.println("Iniciando o servidor...");
		Endpoint.publish("http://localhost:8081/marketplace", new MarketplaceEndpoint());
		Endpoint.publish("http://localhost:8081/grocerieslist", new GroceriesListEndpoint());
		Endpoint.publish("http://localhost:8081/product", new ProductEndpoint());
		Endpoint.publish("http://localhost:8081/bestoffers", new SearchPricesEndpoint());
	}
}