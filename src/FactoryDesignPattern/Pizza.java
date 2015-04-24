package FactoryDesignPattern;

import java.util.ArrayList;

public abstract class Pizza {
	String pizzaName;
	String dough;
	String sauce;
	ArrayList<Object> toppings = new ArrayList<Object>();

	public String getPizzaName() {
		return pizzaName;
	}

	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}

	public String getDough() {
		return dough;
	}

	public void setDough(String dough) {
		this.dough = dough;
	}

	public String getSauce() {
		return sauce;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	public ArrayList<Object> getToppings() {
		return toppings;
	}

	public void setToppings(ArrayList<Object> toppings) {
		this.toppings = toppings;
	}
	
	public void prepare(){
		System.out.println("preparing " + pizzaName);
	}
	
	public void bake(){
		System.out.println("baking " + pizzaName);
	}
	
	public void cut(){
		System.out.println("cutting " + pizzaName);
	}
	
	public void box(){
		System.out.println("boxing " + pizzaName);
	}
}
