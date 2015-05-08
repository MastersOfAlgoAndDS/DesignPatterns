package StrategyDesignPattern;

public class QuickFly implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Flying very quickly");
	}

}
