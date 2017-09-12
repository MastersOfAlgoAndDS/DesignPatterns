package test;

public class Cat extends Animal implements Bird {

	@Override
	public void fly() {
		System.out.println("Cat Fly");
	}

	@Override
	public void shout() {
		System.out.println("Cat Shout");
	}

}
