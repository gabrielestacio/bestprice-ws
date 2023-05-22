package service;

import java.io.IOException;
import model.*;
import repository.Storage;
import repository.StorageInterface;

public class MarketplaceService{
	private StorageInterface storage;
	
	public MarketplaceService() throws IOException {
		storage = Storage.getInstanceOf();
	}
	
	public void registerMarketPlace(Marketplace m) throws IOException {
		storage.saveMarket(m);
	}
	
	public void deleteMarketplace(Marketplace m) throws IOException{
		storage.deleteMarketplace(m.getName());
	}
	
	public Marketplace searchMarketplace(String name) {
		return storage.loadMarketplace(name);
	}
}