package HomeWork;

public class MyThread2 extends Thread {
	private Basket basket;

	public MyThread2(Basket basket) {
		super();
		this.basket = basket;
	}
	@Override
	public void run() {
		basket.outAll();
	}
}
