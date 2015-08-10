package AbstractFactoryDesignPattern;

public class ChicagoCheesePizza extends Pizza {

	/**
	 * 
	 */
	public ChicagoCheesePizza() {
		pizzaName="Chicago Cheese Pizza";
		dough = "Cheese Pizza Dough";
		sauce = "Cheese Alfredo";
		toppings.add("green peppers");
		toppings.add("parmesan cheese");
	}
	
}
