package shop;

import shop.Basket;
import shop.Fruit;

public class Cash {
	private int number;
	
	public Cash(int number){
		setNumber(number);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public void printBill(Basket basket, PriceList priceList){
		String fruitName;
		double result;
		System.out.println("Kasa number"+getNumber()+" Konto:");
		for (Fruit fruit:basket.getFruits()){
			fruitName = fruit.getClass().getName();
			result = fruit.getQuantity()*priceList.get(fruitName);
			System.out.println(fruitName+" "+fruit.getQuantity()+"kg*"+priceList.get(fruitName)+" = "+result);
		}
	}
}
/*
Który kod jest lepszy
Kilkukortne wywołanie
*/