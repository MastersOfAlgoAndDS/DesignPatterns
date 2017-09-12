package test;

public class Client {

	private static Bird bird;

	public static void main(String[] args) {
		Animal a = new Dog();
		Animal c = new Cat();
		// ((Cat) c).fly();

		bird = new Cat();
		bird.fly();

		// Dog d = new Animal();

		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));

	}
}
