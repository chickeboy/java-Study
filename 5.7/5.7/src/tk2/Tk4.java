package tk2;

public class Tk4 {
	public static void main(String[] args) {
		// 静态内部类在创建对象的时候不需要外部类的对象
		O.I i = new O.I();
	}
}

class O {
	private static String name = "O";

	// 静态内部类访问外部类的成员属性，也必须是静态的
	static class I {
		// private String name = "I";

		public void show() {
			// System.out.println(name);
			System.out.println(name);
		}
	}
}
