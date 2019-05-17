package tk;

/*
 * 异常的上抛规范
 *异常如果上抛，过程中某一个方法要么捕获
 *要么继续往上抛，但是最终不能抛给虚拟机
 *会导致方法中断
 */
public class Tk5 {
	public static void main(String[] args) {
		A a = new A();
		a.a(0);
	}
}

class A {
	public void a(int x) throws ArithmeticException {
		B b = new B();
		b.b(x);
	}
	// A这个时候就有2个选择了
	// 1.直接在a方法中捕获b的异常
	// 2.继续往上抛
}

class B {
	public void b(int x) throws ArithmeticException {
		if (x == 0) {
			throw new ArithmeticException();
		}
	}
}
