package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Marketplace{
	private int id;
	private String name;
	private String address;
	private String contact;
	private String opening;
	
	public Marketplace() {}
	
	public Marketplace(String name, String address, String contact, String opening) {
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.opening = opening;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getOpening() {
		return opening;
	}

	public void setOpening(String opening) {
		this.opening = opening;
	}
}