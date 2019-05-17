package tk2;

/*
 * 用 Runnable接口实现的方式去卖票
 */
public class Tk2 {
	public static void main(String[] args) {
		TicketRun run = new TicketRun();
		// run只有一个也就是ticket数据源也只有1个
		// 三根线程操作同一个数据源
		new Thread(run, "1号窗口").start();
		new Thread(run, "3号窗口").start();
		new Thread(run, "2号窗口").start();

	}
}

//synchronized 线程的同步锁 保证一根资源通道内同一时间只能
//有一根线程在操作，就算有睡眠，也要等他完成后让出通道，其他人才能进入
//方法锁(写在方法声明上，对整个方法进行上锁)   对象锁(可以对某个局部代码块进行上锁)
class TicketRun implements Runnable {
	private int ticket = 100;
	private Object obj = new Object();

	// 这里不适合用方法锁：会导致整个循环执行完以后
	// 第一个抢到资源的线程才会让出资源通道
	// 对象锁
	@Override
	public void run() {

		while (true) {
			synchronized (obj) {
				if (ticket == 0) {
					break;
				}
				// 线程发生阻塞，其他线程可以乘虚而入
				System.out.println(Thread.currentThread().getName() + ".......正在出售" + ticket--);
			}
			// 先做完事情然后大家出来一起休息，三张票一起出
			// 如果把睡眠也放在锁里面，一个人出完票，睡眠后，才会让其他人进入，进入是随机的
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
