package org.itstep;

import java.util.ArrayList;

public class CoffeeMaker {
	private ArrayList<Drink> drinks;
	
	public ArrayList<Drink> getDrinks() {
		return drinks;
	}
	public void setDrinks(ArrayList<Drink> drinks) {
		this.drinks = drinks;
	}
	
	public void makeCoffee(int maney){
		int minValue = Integer.MAX_VALUE;
		for (Drink drink : drinks) {//foreach;
			if( minValue>= drink.getPrice()){
				 minValue=drink.getPrice();
			}
		}
		if( minValue> maney){	// without int;
		System.out.println("You shout input "+( minValue - maney)+"yet!");
		return;//break method;
		
		}
		for (Drink drink : drinks) {
			if(maney>=drink.getPrice()){
			System.out.println("You can buy" + drink.getPrice()+" and take "+(maney-drink.getPrice()) + " back!");
		}
	}
}

}
