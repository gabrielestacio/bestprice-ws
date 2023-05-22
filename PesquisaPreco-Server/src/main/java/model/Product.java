package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product{
	private int id;
	private String name;
	private String brand;
	private String measure;
	private int market_id;
	private double price;
	
	public Product() {}
	
	public Product(String name, String brand, String measure, Double price) {
		this.name = name;
		this.brand = brand;
		this.measure = measure;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getMeasure() {
		return measure;
	}

	public void setMeasure(String measure) {
		this.measure = measure;
	}
	
	public int getMarketId() {
		return market_id;
	}

	public void setMarketId(int market_id) {
		this.market_id = market_id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}