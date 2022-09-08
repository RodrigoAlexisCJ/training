
public class PizzaService {

	public static void main(String[] args) {
		Pizza pizza1 = new ThinPizza();
		pizza1 = new Cheese(pizza1);
		pizza1 = new Olives(pizza1);
		
		Pizza pizza2 = new ThickPizza();
		pizza2 = new Cheese(pizza2);
		pizza2 = new Olives(pizza2);
		
		
		System.out.println(pizza1.getDescription()+" a price of "+pizza1.cost());
		System.out.println(pizza2.getDescription()+" a price of "+pizza2.cost());

	}

}
