
public class Olives extends CondimentDecorator{
	Pizza pizza;
	public Olives(Pizza pizza) {
		this.pizza=pizza;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription()+" with Olives";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return pizza.cost()+.20;
	}

}
