package DecoratorDesignPattern;

public abstract class IceCream {
		protected String description;
		protected double cost;

		public double getCost() {
			return cost;
		}

		public void setCost(int cost) {
			this.cost = cost;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
		
		
}
