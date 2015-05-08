package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.Observer;

public class Subject implements IObservable {

	ArrayList<IObserver> observers = null;

	public Subject() {
		observers = new ArrayList<IObserver>();
	}

	@Override
	public void register(IObserver o) {
		observers.add(o);

	}

	@Override
	public void unregister(IObserver o) {
		observers.remove(o);
	}

	@Override
	public void notifi() {
		for(IObserver o : observers){
			o.updateObserver();
		}

	}
	
	@Override
	public void changeState(){
		System.out.println("Subject state changed");
		notifi();
		System.out.println("Observers Updated");
	}

}
