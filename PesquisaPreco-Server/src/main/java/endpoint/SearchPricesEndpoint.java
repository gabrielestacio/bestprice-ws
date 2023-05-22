package endpoint;

import javax.jws.WebService;
import java.io.IOException;
import javax.jws.WebMethod;
import model.*;
import service.*;
import org.json.*;

@WebService
public class SearchPricesEndpoint{
	private SearchPricesService service;
	
	public SearchPricesEndpoint() throws IOException{
		service = new SearchPricesService();
	}
	
	@WebMethod
	public String searchBestOffers() {
		return service.searchBestPrices();
	}
}