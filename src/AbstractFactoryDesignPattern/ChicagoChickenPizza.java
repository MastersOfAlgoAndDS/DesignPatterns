package AbstractFactoryDesignPattern;

public class ChicagoChickenPizza extends Pizza {

	/**
	 * 
	 */
	public ChicagoChickenPizza() {
		pizzaName = "Chicago Chicken Pizza";
		dough = "thin crust";
		sauce = "marinara sauce";
		toppings.add("mozarrella cheese");
		toppings.add("buffalo chicken pieces");
		toppings.add("red onions");
	}
	
}
