package org.itstep;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class CoffeeMakerTest {

	@Test
	
		public void test() {
			Drink drink1 = new Drink("espresso", 600);
			Drink drink2 = new Drink("americano", 700);
			Drink drink3 = new Drink("cappucino", 800);
			Drink drink4 = new Drink("latte", 900);
			
			ArrayList<Drink>drinks = new ArrayList<Drink>();
			drinks.addAll(Arrays.asList(drink1, drink2,drink3,drink4));//��������� ������� �� ����� 
			
			CoffeeMaker maker = new CoffeeMaker();
			maker.setDrinks(drinks);
			maker.makeCoffee(1000);
			
			
		}

}
