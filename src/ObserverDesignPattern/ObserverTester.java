package ObserverDesignPattern;

public class ObserverTester {
	public static void main(String[] args) {
		IObservable subject = new Subject();
		IObserver observer = new Observer();
		
		subject.register(observer);
		subject.changeState();
		
	}
}
