package tk4;

import java.util.LinkedList;

/**
 * ������������ģʽ ��֤�̵߳�ͬ���� �̼߳����ͨ�� ��20�� ÿ����5�� ����5�� ��5�� �����겻�ܳ� 1.��ʺ 2.��ʺ
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

//ʹ�ü̳�Thread�ķ���������ݵĹ��� Basket��Ψһ��
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

//��
class Basket {
	// 1���� װʺ ��֤2���߳���Ҫ����ͬһ������
	private LinkedList<Shit> lk = new LinkedList<Shit>();
	private Object object = new Object();

	// �����߳���Ҫ��һ�����Ե���������Ϊ�жϵı�׼
	// ��һ��
	public   void put(Shit shit) {// ����5�� put�ķ���Ӧ���ó�ͨ��
		if (lk.size() == 5) {
			try {
				
				wait();// �߳��ó�ͨ���Լ��ȴ��������Ĵ��벻ִ��
				// �ȵ��������̻߳����ҲŻ�����
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
		// ������û�����ݵ�ʱ����Ҫ���
		System.out.println("��............." + shit);
		lk.add(shit);
		// �⻽�������߳�û�ã���Ϊ��Ҫ�Լ���ͨ���ó���
		notify();// ���ѱ���
		// ���˲��ܽ���
	}

	// ��һ�� �Ƚ����������ȳ�
	public   void get() {
		if (lk.size() == 0) {// �������������
			// �����Ҿ��ó���Դͨ����put
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
		// ����������5�����ݵ�ʱ��Ӧ�ó�
		System.out.println("��............." + lk.removeLast());
		notify();
	}

	// ����20�ε�����
	public synchronized void putAll() {
		for (int i = 0; i < 20; i++) {
			Shit shit = new Shit(i);// ����һ��
			put(shit);
		}
	}

	public synchronized void getAll() {
		for (int i = 0; i < 20; i++) {
			get();
		}
	}
}

//ʺ��
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
		return "ʺ......." + (id + 1);
	}

}
