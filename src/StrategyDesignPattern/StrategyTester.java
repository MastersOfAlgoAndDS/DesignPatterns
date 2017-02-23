package StrategyDesignPattern;

public class StrategyTester {
	public static void main(String[] args) {
		// Create a mallard duck
		QuackBehavior q = new DoubleQuack();
		FlyBehavior f = new QuickFly();
		Duck mallard = new MallardDuck(q, f);
		System.out.println(mallard.getType());
		mallard.quack();
		mallard.fly();
		mallard.swim();

		// Create Decoy Duck
		Duck decoy = new DecoyDuck();
		System.out.println(decoy.getType());
		decoy.swim();

		// Create Rubber duck
		q = new SingleQuack();
		Duck rubber = new RubberDuck(q);
		System.out.println(rubber.getType());
		rubber.quack();
		rubber.setF(new QuickFly());
		rubber.fly();
		rubber.swim();
	}
}
