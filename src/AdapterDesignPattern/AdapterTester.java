package AdapterDesignPattern;

public class AdapterTester {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.quack();
		mallard.fly();

		Turkey t = new Turkey();
		t.fly();

		System.out.println("adapting turkey");
		Duck fake = new DuckAdapter(t);
		fake.quack();
		fake.fly();
	}
}
