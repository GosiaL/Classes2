package shop;

import shop.Banana;
import shop.Basket;
import shop.Cash;
import shop.PriceList;

public class Shop {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		
			PriceList priceList = new PriceList();
			priceList.set("Strawberry", 10);
			priceList.set("Banana", 12);
			
			Basket basket = new Basket();
			basket.add(new Strawberry(5));
			basket.add(new Banana(7));
			
			basket.showContent();
			
			Cash cash = new Cash(1);
			cash.printBill(basket,priceList);
			
	}

}
