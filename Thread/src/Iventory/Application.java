package Iventory;

public class Application {

	public static void main(String[] args) throws InterruptedException {
		IventoryManager manager = new IventoryManager();
		Thread iventoryTask = new Thread(new Runnable() {
			@Override
			public void run() {
				manager.populatedSoldProduct();	
			}
		});
		Thread displayTask = new Thread(new Runnable() {
			@Override
			public void run() {
				manager.displaySoldProduct();;	
			}
		});
		iventoryTask.start();
		Thread.sleep(200);
		displayTask.start();
	}

}
