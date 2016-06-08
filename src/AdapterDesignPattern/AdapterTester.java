package AdapterDesignPattern;

/**
 * 
 * @Adapter_Design_Pattern: // Our source here is turkey and we want to develop
 *                          an adapter which makes turkey behave like duck or
 *                          appear like duck.
 * 
 *                          2 ways of doing it -
 * 
 *                          1. Class Adapter Implementation i.e. The adapter
 *                          extends the source class i.e. Turkey and implements
 *                          Duck interface.
 * 
 *                          2. Object Adapter Implementation i.e. the adapter
 *                          simple implements the Duck interface. Here there is
 *                          also composition i.e. the Adapter class is composed
 *                          of the source object i.e. Turkey object.
 * 
 * 
 * @author Milind
 *
 */
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
