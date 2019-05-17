package tk2;

/*
 * 两种开启线程方式的区别
 * 100张票 在三个窗口卖
 */
public class Tk {
	public static void main(String[] args) {
		new TicketThread("1号窗口").start();
		new TicketThread("3号窗口").start();
		new TicketThread("2号窗口").start();

	}
}

class TicketThread extends Thread {
	private int ticket = 100;

	// 其实我们只有100张票，但是因为ticket写在我们的
	// 子类里，所以每开一根线程都会创建一个新的ticket 總共有了300张票
	public TicketThread(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}

	@Override
	public void run() {
		while (ticket > 0) {
			System.out.println(getName() + ".......正在出售" + ticket--);
		}
	}
}
