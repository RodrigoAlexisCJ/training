package Iventory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class IventoryManager {
	List<Product> soldProductList= new CopyOnWriteArrayList<>();
	List<Product> purchasedProductList = new ArrayList<>();
	
	public void populatedSoldProduct() {
		for(int i=0; i< 50; i++) {
			Product prod = new Product(i,"Test_Product_"+i);
			soldProductList.add(prod);
			System.out.println("ADDED: "+soldProductList.get(i));
//			soldProductList.stream().forEach((a)->System.out.println("ADDED: "+a));
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void displaySoldProduct() {
		soldProductList.stream().forEach((a)->System.out.println("SOLD: "+a));
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
