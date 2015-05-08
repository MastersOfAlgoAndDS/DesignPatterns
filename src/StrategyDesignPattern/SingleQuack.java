package StrategyDesignPattern;

public class SingleQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("single quack behavior");
	}

}
