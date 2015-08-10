package AbstractFactoryDesignPattern;

public abstract class PizzaStore {
	public abstract Pizza createPizza(String item);
	
	public Pizza orderPizza(String type){
		Pizza pizza	= createPizza(type);
		System.out.println("Making " + pizza.getPizzaName());
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
