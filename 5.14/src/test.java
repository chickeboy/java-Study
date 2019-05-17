public class test {
	public static void main(String[] args) {
		Mythread mythread = new Mythread("A");
		mythread.start();
		Mythread2 mythread2 = new Mythread2();
		Thread thread = new Thread(mythread2, "B");
		thread.start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					System.out.println(Thread.currentThread().getName() + "......." + "ÀÏ¿×ÕæË§");
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		},"C").start();
	}
}

class Mythread extends Thread {
	public Mythread(String string) {
		super(string);
	}
	public void run() {
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.println(Thread.currentThread().getName() + "........" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Mythread2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i < 27; i++) {
			System.out.println(Thread.currentThread().getName() + "........" + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}