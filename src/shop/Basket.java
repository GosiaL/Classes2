package shop;

import shop.Fruit;

import java.util.ArrayList;
import java.util.List;

public class Basket {
	private int number;
	private static int currentNumber = 1;
	
	public Basket(){
		this.number = currentNumber++;
	}
	
	private List<Fruit> fruits = new ArrayList<Fruit>();
	
	void add(Fruit f){
		fruits.add(f);
	}
	
	public void showContent(){
		System.out.println("Zawartość koszyka numer "+number);
		for (Fruit f:fruits){
			System.out.println(f);
		}
	}
	
	public ArrayList<Fruit> getFruits(){
		return (ArrayList<Fruit>) fruits;
	}
}
