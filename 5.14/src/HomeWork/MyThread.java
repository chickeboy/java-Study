package HomeWork;

public class MyThread extends Thread {
	private Basket basket;
	
	public MyThread(Basket basket) {
		super();
		this.basket = basket;
	}

	@Override
	public void run() {
		basket.putAll();
	}
}
