
public class Cheese extends CondimentDecorator {
	Pizza pizza;
	
	public Cheese(Pizza pizza) {
		this.pizza=pizza;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription()+" with Cheese";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return pizza.cost()+0.5;
	}

}
