package AbstractFactoryDesignPattern;

public class TestClient {
	public static void main(String[] args) {
		PizzaStore nyps = new NewYorkPizzaStore();
		PizzaStore cps = new ChicagoPizzaStore();
		
		Pizza pizza = nyps.orderPizza("cheese");
		System.out.println("Milind ordered " + pizza.getPizzaName());
		System.out.println();
		pizza = cps.orderPizza("chicken");
		System.out.println("Vivek ordered " + pizza.getPizzaName());
		System.out.println();
		pizza = nyps.orderPizza("chicken");
		System.out.println("Mrunal ordered " + pizza.getPizzaName());
		System.out.println();
		pizza = cps.orderPizza("cheese");
		System.out.println("Renuka ordered " + pizza.getPizzaName());
		System.out.println();
	}
}
