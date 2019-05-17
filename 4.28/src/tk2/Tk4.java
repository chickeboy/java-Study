package tk2;

/*
 * 单例模式:让一个类只能生成一个唯一的对象，只有一块内存
 */
public class Tk4 {
	public static void main(String[] args) {
		A a1 = A.getInstance();
		A a2 = A.getInstance();
		System.out.println(a1);
		System.out.println(a2);
		B b = new B();
		System.out.println(b.b);
	}
}

//懒汉式，饿汉式
class A {
	private static A a = new A();// 公用的一个变量

	private A() {// 外面的人无法通过构造方法创建A的对象

	}

	public static A getInstance() {// 外面的人要我A的对象
		// 必须通过这个方法才能拿到
//		if (a == null) {// 第一次才会创建对象
//			a = new A();
//		}
		return a;
	}
}
