package AbstractFactoryDesignPattern;

public class NewYorkPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String item) {
		if (item.toLowerCase() == "cheese")
			return new NewYorkCheesePizza();
		else if (item.toLowerCase() == "chicken")
			return new NewYorkChickenPizza();
		else
			return null;
	}

}
