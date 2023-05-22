package service;

import java.io.IOException;
import model.*;
import repository.Storage;
import repository.StorageInterface;

import org.json.*;

public class SearchPricesService{
	private StorageInterface storage;
	
	public SearchPricesService() throws IOException{
		storage = Storage.getInstanceOf();
	}
	
	public String searchBestPrices() {
		return storage.searchBestOffers();
	}
}