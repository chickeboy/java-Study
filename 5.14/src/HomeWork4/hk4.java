package HomeWork4;
/*有5辆火车要过山洞,但确保山洞同时只能有一辆火车通过（过山洞需要2秒），
打印输出火车通过的顺序。
（过山洞的顺序是不可控的，只要保证同一时间只有一辆火车能通过山洞即可）
提示：使用线程同步*/
public class hk4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread myThread = new MyThread();
		new Thread(myThread,"第一列火车").start();
		new Thread(myThread,"第二列火车").start();
		new Thread(myThread,"第三列火车").start();
		new Thread(myThread,"第四列火车").start();
		new Thread(myThread,"第五列火车").start();
	}
}
class MyThread implements Runnable{
	Object object = new Object();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (object) {
			System.out.println(Thread.currentThread().getName()+"正在通过山洞");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
