package DecoratorDesignPattern;

public class Cone extends IceCreamDecorator {
	IceCream ic = null;
	
	public Cone(IceCream i){
		ic =i;
	}
	
	@Override
	public String getDescription() {
		return ic.getDescription() + " in cone";
	}
	
	@Override
	public double getCost() {
		return 0.0 + ic.getCost();
	}
}
