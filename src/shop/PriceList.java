package shop;

import java.util.HashMap;

public class PriceList {
	private HashMap<String,Double > prices = new HashMap<String,Double>();

	public void set(String name,double price){
		prices.put(name, price);
	}
	
	public double get(String name){
		return prices.get(name);
	}
	
}
