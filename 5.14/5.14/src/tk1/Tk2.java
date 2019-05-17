package tk1;

/*
 * 第二种启动线程的方式
 * 实现一个叫Runnable的接口
 * 
 *使用开启线程的三种方式
 *1根线程打印字母a-z 每隔1秒
 *1根线程打印数字1-26 每隔2秒
 *1根线程打印汉字老孔巨帅 死循环 每隔0.2秒
 * 
 */
public class Tk2 {
	public static void main(String[] args) {
		MyRun myRun = new MyRun();
		Thread thread = new Thread(myRun, "A");
		thread.start();
		Thread thread2 = new Thread(myRun, "B");
		thread2.start();
		// 匿名内部类开启线程
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println(Thread.currentThread().getName() + "...." + i);
					// 这里只能通过Thread.currentThread().getName()获取当前线程名
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}, "C").start();
	}
}

class MyRun implements Runnable {
//因为没有了父类Thread所以这里没有name这个线程名称的属性
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "...." + i);
			// 这里只能通过Thread.currentThread().getName()获取当前线程名
			// 线程的阻塞
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // 睡眠1秒，自动唤醒
		}
	}

}
