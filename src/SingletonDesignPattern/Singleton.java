package SingletonDesignPattern;

public class Singleton {
	private static volatile Singleton single;

	private Singleton() {
		if (single != null)
			throw new RuntimeException(
					"Exception: Cannot Initialize object using Reflection since object already created. To make the singleton safe from Java Reflection calls.");
	}

	public static Singleton getSingleton() {
		if (single == null) {
			// To make the block threadsafe so that each tread also gets same
			// instance of singleton.
			synchronized (Singleton.class) {

				if (single == null) {
					single = new Singleton();
				}
			}
		}
		return single;
	}

	public void print() {
		System.out.println("Welcome Singleton Object");
	}

	public static void main(String[] args) throws Exception {
		Singleton s = getSingleton();
		s.print();
		System.out.println(s);
		Singleton t = getSingleton();
		t.print();
		System.out.println(t);

	}
}