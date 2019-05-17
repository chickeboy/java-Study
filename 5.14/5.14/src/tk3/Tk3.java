package tk3;

/*
 * ���� ������ֱ𽫶Է��Ķ�����Ϊ�Լ��Ķ�����
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
