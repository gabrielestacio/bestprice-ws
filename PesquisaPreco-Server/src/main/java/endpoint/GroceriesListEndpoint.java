package endpoint;

import javax.jws.WebService;
import java.io.IOException;
import java.util.ArrayList;

import javax.jws.WebMethod;
import model.*;
import service.*;

@WebService
public class GroceriesListEndpoint {
	private GroceriesListService service;
	
	public GroceriesListEndpoint() throws IOException{
		service = new GroceriesListService();
	}
	
	@WebMethod
	public void registerItemsToGroceriesList(ArrayList<String> l) throws IOException{
		service.registerItemsToGroceriesList(l);
	}
	
	@WebMethod
	public void registerNewGroceriesList(ArrayList<String> l) throws IOException{
		service.registerNewGroceriesList(l);
	}
	
	@WebMethod
	public void deleteGroceriesList(ArrayList<String> l) throws IOException{
		service.deleteGroceriesList(l);
	}
	
	@WebMethod
	public ArrayList<String> searchGroceriesList() throws IOException{
		return service.searchGroceriesList();
	}
}
