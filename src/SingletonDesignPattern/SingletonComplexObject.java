package SingletonDesignPattern;

public class SingletonComplexObject {

	private static volatile Email email;

	private SingletonComplexObject() {
		if (email != null)
			throw new RuntimeException(
					"Exception: Cannot Initialize object using Reflection since object already created.");
	}

	public static Email getSingleton() {
		if (email == null) {
			synchronized (SingletonComplexObject.class) {
				if (email == null) {
					email = new Email("hello", "hello@world.com");
				}
			}
		}
		return email;
	}

	public void print() {
		System.out.println("Welcome Singleton Object");
	}

	public static void main(String[] args) throws Exception {
		Email s = getSingleton();
		s.print();
		System.out.println(s);

		s.setVerzender("new person");
		s.setEmailWachtwoord("new@email.com");
		s.print();
		System.out.println(s);
	}

}
