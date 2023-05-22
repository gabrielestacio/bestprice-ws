package service;

import java.io.IOException;
import java.util.ArrayList;
import repository.Storage;
import repository.StorageInterface;

public class GroceriesListService{
	private StorageInterface storage;
		
	public GroceriesListService() throws IOException {
		storage = Storage.getInstanceOf();
	}
		
	public void registerNewGroceriesList(ArrayList<String> l) throws IOException {
		storage.saveNewList(l);
	}
	
	public void registerItemsToGroceriesList(ArrayList<String> l) throws IOException {
		storage.saveItemsToList(l);
	}
	
	public void deleteGroceriesList(ArrayList<String> l) throws IOException{
		storage.deleteList();
	}
		
	public ArrayList<String> searchGroceriesList() {
		return storage.loadList();
	}
}