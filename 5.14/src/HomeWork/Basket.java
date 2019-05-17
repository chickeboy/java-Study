package HomeWork;

import java.util.LinkedList;

public class Basket {
	LinkedList<Apple> linkedList = new LinkedList<Apple>();
	private Object object = new Object();
	public void put(Apple apple) {
		if (linkedList.size()==1) {
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
		System.out.println("·ÅÈë............"+apple);
		linkedList.add(apple);
		notify();
	}
	public void output() {
		if (linkedList.size()==0) {
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
		System.out.println("ÄÃ³ö............"+linkedList.removeLast());
		notify();
	}
	public synchronized void putAll() {
		for (int i = 0; i <4; i++) {
			Apple apple = new Apple(i);
			put(apple);
		}
	}
	public synchronized void outAll() {
		for (int i = 0; i <4; i++) {
			output();
		}
	}
}
