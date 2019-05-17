package HomeWork3;

public class Pach implements Runnable{
	private int pach = 100;
	Object object = new Object();
	@Override
	public void run() {
		while (true) {
			synchronized (object) {	
				if (pach<1) {
					break;
				}
				pach =pach/2;
				System.out.println(Thread.currentThread().getName()+pach);
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
