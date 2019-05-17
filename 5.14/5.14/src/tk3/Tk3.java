package tk3;

/*
 * 死锁 两个类分别将对方的对象作为自己的对象锁
 */
public class Tk3 {
	public static void main(String[] args) {
		new A().start();
		new B().start();
	}
}

class A extends Thread {
	private B b = new B();

	@Override
	public void run() {
		for (int i = 0; i < 4; i++) {
			synchronized (b) {
				System.out.println(i);
			}
		}
	}
}

class B extends Thread {
	private A a = new A();

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			synchronized (a) {
				System.out.println(i);
			}
		}
	}
}
