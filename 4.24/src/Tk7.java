
public class Tk7 {

	public static void main(String[] args) {
		// new 申请一块堆内存 B()确定这块内存的内部结构
		// 构造方法一般在直接就可以确定这个对象的属性值的时候
		// 我们可以在创建对象的时候就调用它的有参构造方法
//		B b = new B();// 没有参数，不需要对属性赋值
//		// 生成的对象的属性值直接使用默认的
//		// 需要值的话后续赋值
//		b.age = 3;
//		b.name = "王五";
		String name = "xx";
		int age = 3;
		System.out.println(new B1(age, name));
		B1 b = new B1(name, age);
		B1 b1 = new B1(age, name);
		// 系统会根据你传入的实参的顺序和类型	
		// 去匹配具体调用哪个构造方法
		// 构造方法和普通方法的区别
		// 1.构造方法方法名大写 必须和类名一致
		// 2.构造方法没有返回值类型()
		// 3.构造方法只会执行一次，普通方法可以使用多次

	}
}

/*
 * 如果程序员没有特殊要求 系统会赠送一个无参构造方法 保证你至少能创建一个对象 当程序员自己写了一个有参构造方法，无参的构造方法系统就不再赠送了
 * 如果还需要无参的构造方法，那么自己就要去写一个无参的 构造方法
 */
class B1 {
	// 构造方法:创建对象的时候才会使用的一个特殊方法
	//
	String name;
	int age;

	// 方法的重载:同名不同参
	// 不同参 :参数个数不同，参数的数据类型顺序不同
	//
	public B1(String name, int age) {
		this.name = name;
		this.age = age;
		/*
		 * b.age = 3; b.name = "王五";
		 */
	}

	public B1(int age, String name) {
		this.name = name;
		this.age = age;
		/*
		 * b.age = 3; b.name = "王五";
		 */
	}

}
