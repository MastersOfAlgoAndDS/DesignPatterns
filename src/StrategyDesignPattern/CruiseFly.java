package StrategyDesignPattern;

public class CruiseFly implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("flying like cruising");
	}

}
