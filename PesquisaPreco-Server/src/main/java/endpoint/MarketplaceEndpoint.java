package endpoint;

import javax.jws.WebService;
import java.io.IOException;
import javax.jws.WebMethod;
import model.*;
import service.*;

@WebService
public class MarketplaceEndpoint{
	private MarketplaceService service;
	
	public MarketplaceEndpoint() throws IOException {
		service = new MarketplaceService();
	}
	
	@WebMethod
	public void registerMarket(Marketplace m) throws IOException {
		service.registerMarketPlace(m);
	}
	
	@WebMethod
	public void deleteMarket(Marketplace m) throws IOException{
		service.deleteMarketplace(m);
	}
	
	@WebMethod
	public Marketplace searchMarket(String name) {
		return service.searchMarketplace(name);
	}
}