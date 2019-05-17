
public class TickTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tickthread tickthread = new Tickthread();
		new Thread(tickthread,"1号窗口").start();
		new Thread(tickthread,"2号窗口").start();
		new Thread(tickthread,"3号窗口").start();
		
	}

}
class Tickthread implements Runnable{
	private int ticket = 100;
	Object object = new Object();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {	
			if (ticket==0) {
				break;
			}
		synchronized (object) {
				System.out.println(Thread.currentThread().getName()+"..........."+"正在出售"+ticket--);
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