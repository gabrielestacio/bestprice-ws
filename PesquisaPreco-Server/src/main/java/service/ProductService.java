package service;

import java.io.IOException;
import java.util.ArrayList;
import model.*;
import repository.Storage;
import repository.StorageInterface;

public class ProductService{
	private StorageInterface storage;
	
	public ProductService() throws IOException{
		storage = Storage.getInstanceOf();
	}
	
	public void registerProduct(Product p) throws IOException{
		storage.saveProduct(p);
	}
	
	public void deleteProduct(Product p) throws IOException{
		storage.deleteProduct(p.getName());
	}
	
	public ArrayList<Product> searchProduct(String name) {
		return storage.loadProducts(name);
	}
}