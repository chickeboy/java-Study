package tk2;

/*
 * 内部类:为了弥补Java单继承
 * 可以在外部类的内部嵌套一个类，让这个类去继承别人的东西
 * 那么外部类通过内部类也可以获取到其他类的属性
 * 成员内部类
 * 静态内部类
 * 局部内部类
 * 匿名内部类
 * 
 * 
 * 
 * 
 */
public class Tk2 {
	public static void main(String[] args) {
		// 如何创建内部类的对象
		Out out = new Out();
		Out.In in = out.new In();// 内部类创建对象需要依靠外部类的对象
		out.show();
		in.show();
	}
}

class Out {
	private String name = "Out";

	class In {
		private String name = "In";

		public void show() {// 内部类访问外部类的属性无视访问修饰权限
			System.out.println(this.name);// 自己的私有属性
			// 内部类和外部类有重名的成员属性
			System.out.println(Out.this.name);
		}
	}

	// 外部类访问内部类的成员属性，受不受访问修饰权限的影响
	public void show() {
		In in = new In();// 必须要创建内部类的对象
		System.out.println(in.name);
	}
}
