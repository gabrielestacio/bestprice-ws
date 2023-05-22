package endpoint;

import javax.jws.WebService;
import java.io.IOException;
import java.util.ArrayList;

import javax.jws.WebMethod;
import model.*;
import service.*;

@WebService
public class ProductEndpoint {
	private ProductService service;
	
	public ProductEndpoint() throws IOException{
		service = new ProductService();
	}
	
	@WebMethod
	public void registerProduct(Product p) throws IOException{
		service.registerProduct(p);
	}
	
	@WebMethod
	public void deleteProduct(Product p) throws IOException{
		service.deleteProduct(p);
	}
	
	@WebMethod
	public ArrayList<Product> searchProduct(String name) {
		return service.searchProduct(name);
	}
}
