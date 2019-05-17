package tk4;

import java.util.LinkedList;

/**
 * 生产者消费者模式 保证线程的同步， 线程间产生通信 拉20次 每次拉5坨 拉完5坨 吃5坨 不拉完不能吃 1.拉屎 2.吃屎
 * 
 * @author lagone
 *
 */
public class Tk4 {
	public static void main(String[] args) {
		Basket basket = new Basket();
		new PutThread(basket).start();
		new GetThread(basket).start();
	}
}

//使用继承Thread的方法完成数据的共享 Basket是唯一的
class PutThread extends Thread {
	private Basket basket;

	public PutThread(Basket basket) {
		super();
		this.basket = basket;
	}

	@Override
	public void run() {
		basket.putAll();
	}
}

class GetThread extends Thread {
	private Basket basket;

	public GetThread(Basket basket) {
		super();
		this.basket = basket;
	}

	@Override
	public void run() {
		basket.getAll();
	}
}

//坑
class Basket {
	// 1容器 装屎 保证2根线程是要操作同一个容器
	private LinkedList<Shit> lk = new LinkedList<Shit>();
	private Object object = new Object();

	// 两根线程需要有一个共性的属性来作为判断的标准
	// 拉一坨
	public   void put(Shit shit) {// 放满5个 put的方法应该让出通道
		if (lk.size() == 5) {
			try {
				
				wait();// 线程让出通道自己等待，后续的代码不执行
				// 等到有其他线程唤醒我才会醒来
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 当容器没有数据的时候需要添加
		System.out.println("拉............." + shit);
		lk.add(shit);
		// 光唤醒其他线程没用，因为需要自己把通道让出来
		notify();// 唤醒别人
		// 别人才能进来
	}

	// 吃一坨 先进后出，后进先出
	public   void get() {
		if (lk.size() == 0) {// 不存在抢的情况
			// 上来我就让出资源通道给put
			try {
				
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 当容器存满5条数据的时候应该吃
		System.out.println("吃............." + lk.removeLast());
		notify();
	}

	// 整个20次的流程
	public synchronized void putAll() {
		for (int i = 0; i < 20; i++) {
			Shit shit = new Shit(i);// 创建一个
			put(shit);
		}
	}

	public synchronized void getAll() {
		for (int i = 0; i < 20; i++) {
			get();
		}
	}
}

//屎类
class Shit {
	private int id;

	public Shit(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "屎......." + (id + 1);
	}

}
