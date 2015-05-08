package AdapterDesignPattern;

public class DuckAdapter implements Duck {

	Turkey t;
	
	public DuckAdapter(Turkey t) {
		this.t=t;
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
