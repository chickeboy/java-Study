/*
 * A@6d06d69c
A@7852e922
A@4e25154f
A@70dea4e
A@5c647e05
A@33909752
A@55f96302
A@3d4eac69
A@42a57993
A@75b84c92
 */
public class Tk6 {
	public static void main(String[] args) {
		// A a = new A();
		for (int i = 0; i < 10; i++) {
			A a = new A();
			a = null;
			System.out.println(a);
		}
		System.out.println("=====");
		B b = new B();
		System.out.println(b);
		A a = new A();
		System.out.println(a);
	}
}

class A {
	String name;
}
class B {
	String name;
}
