package model;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class List{
	private ArrayList<String> groceries;
	
	public List() {
		this.groceries = new ArrayList<String>();
	}
	
	public List(ArrayList<String> groceries) {
		this.groceries = groceries;
	}

	public ArrayList<String> getGroceries() {
		return groceries;
	}

	public void setGroceries(ArrayList<String> groceries) {
		this.groceries = groceries;
	}
	
	@Override
	public String toString() {
		String string = new String();
		
		if(!groceries.isEmpty()) {
			string = groceries.get(0);
			for(int i = 1; i < groceries.size() - 1; i++) {
				string = string + "\n" + groceries.get(i);
		
			}
		}
		return string;
	}
}