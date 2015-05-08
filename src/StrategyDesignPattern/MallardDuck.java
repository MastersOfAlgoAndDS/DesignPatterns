package StrategyDesignPattern;

public class MallardDuck extends Duck {
	public MallardDuck(QuackBehavior q, FlyBehavior f) {
		type="Mallard Duck";
		this.q=q;
		this.f=f;
	}
}
