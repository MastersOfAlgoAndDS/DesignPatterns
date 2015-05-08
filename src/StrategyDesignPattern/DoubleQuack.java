package StrategyDesignPattern;

public class DoubleQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Double quack behavior");
	}

}
