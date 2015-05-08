package StrategyDesignPattern;

public abstract class Duck {
	String type;
	FlyBehavior f;
	QuackBehavior q;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public FlyBehavior getF() {
		return f;
	}

	public void setF(FlyBehavior f) {
		this.f = f;
	}

	public QuackBehavior getQ() {
		return q;
	}

	public void setQ(QuackBehavior q) {
		this.q = q;
	}

	public void fly(){
		f.fly();
	}
	
	public void quack(){
		q.quack();
	}
	
	public void swim() {
		System.out.println("Duck swimming");
	}

}
