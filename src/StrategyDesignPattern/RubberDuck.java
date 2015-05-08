package StrategyDesignPattern;

public class RubberDuck extends Duck {
	public RubberDuck(QuackBehavior q) {
		type="Rubber Duck";
		this.q=q;
	}
	
}
