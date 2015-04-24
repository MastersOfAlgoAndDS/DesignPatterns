package FactoryDesignPattern;

public class NewYorkCheesePizza extends Pizza {

	/**
	 * 
	 */
	public NewYorkCheesePizza() {
		pizzaName="New York Cheese Pizza";
		dough="whole wheat dough";
		sauce="buffalo sauce";
		toppings.add("black olives");
		toppings.add("swiss cheese");
	}
	
}
