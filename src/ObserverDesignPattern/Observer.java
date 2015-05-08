package ObserverDesignPattern;

public class Observer implements IObserver {

	@Override
	public void updateObserver() {
		System.out.println("observer is updated");
		display();

	}

	@Override
	public void display() {
		System.out.println("observer showing updated display");

	}

}
