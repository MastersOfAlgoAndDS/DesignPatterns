package AdapterDesignPattern;

/**
 * @Object_Adapter_Implementation: Object Adapter Implementation i.e. the
 *                                 adapter simple implements the Duck interface.
 *                                 Here there is also composition i.e. the
 *                                 Adapter class is composed of the source
 *                                 object i.e. Turkey object.
 * 
 * @author Milind
 *
 */
public class DuckAdapter implements Duck {

	Turkey t;

	public DuckAdapter(Turkey t) {
		this.t = t;
	}

	@Override
	public void quack() {
		System.out.println("Duck Quack");

	}

	@Override
	public void fly() {
		System.out.println("Duck Fly");

	}

}
