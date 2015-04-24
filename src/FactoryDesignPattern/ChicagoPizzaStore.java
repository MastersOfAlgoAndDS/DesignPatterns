package FactoryDesignPattern;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String item) {
		if (item.toLowerCase() == "cheese")
			return new ChicagoCheesePizza();
		else if (item.toLowerCase() == "chicken")
			return new ChicagoChickenPizza();
		else
			return null;
	}

}
