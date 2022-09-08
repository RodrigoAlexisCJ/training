package LambdaPractical;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Car> cars = new ArrayList<>( List.of(
				new Car("Honda", "Accord", "Red", 22300),
				new Car("Honda", "Civic", "Blue", 17700),
				new Car("Toyota", "Land Cruiser", "White", 48500),
				new Car("Toyota", "Corolla", "Black", 16200),
				new Car("Toyota", "Camry", "Blue", 24000),
				new Car("Nissan", "Sentra", "White", 17300),
				new Car("Mitsubishi", "Lancer", "White", 20000),
				new Car("Jeep", "Wrangler", "Red", 24500)
				));	
		//cars.stream().forEach((a)->System.out.println(a));
//		printCarsPriceRange(cars,18000,22000);
//		printCarByColor(cars,"Red");
		CarCondition<Car> carc = (a)->{
			return a.getPrice()>=18000 && a.getPrice()<=22000;
		};
		
		CarCondition<Car> carc2 = (a)->{
			return a.getColor().equals("Blue");
		};
		
		System.out.println("Printing cars between price 18000 and 22000");
//		printCars(cars,new CarCondition() {
//
//			@Override
//			public boolean test(Car c) {
//				return c.getPrice()>=18000 && c.getPrice()<=22000;
//			}
//			
//		});
		
		printCars(cars,carc);
		printCars(cars,(a)->a.getPrice()>=18000 && a.getPrice()<=22000);
		
		System.out.println("Printing cars that are blue");
//		printCars(cars,new CarCondition() {
//
//			@Override
//			public boolean test(Car c) {
//				return c.getColor().equals("Blue");
//			}
//			
//		});
		
		printCars(cars,carc2);
		printCars(cars,(a)-> a.getColor().equals("Blue"));
	}
		
	
	public static void printCars(List<Car> cars, CarCondition<Car> condition) {
		for(Car car: cars) {
			if(condition.test(car)) {
				car.printCar();
			}
		}
	}
	
	public static void printCarsPriceRange(List<Car> cars,int low,int high) {
		for(Car car:cars) {
			if(low<=car.getPrice() && car.getPrice()<=high) {
				car.printCar();
			}
		}
	}
	public static void printCarByColor(List<Car> cars, String color) {
		for(Car car:cars) {
			if(car.getColor().equals(color)) {
				car.printCar();
			}
		}
	}
}
