package tk2;

/*
 * 接口:interface，其实接口是一种代码规范
 * 接口其实是一个特殊的抽闲类，但是不是类
 * 里面放的都是抽象方法
 * 接口就是将一些类共有的行为抽取出来
 * 里面一般放的都是动作（抽象方法）
 * 接口不能私有化
 */
public class Tk2 {
	public static void main(String[] args) {
		Fly fly = new Bird();
		God god = new God();
		god.leadFly(fly);
		fly = new Person();
		god.leadFly(fly);
	}
}

class God {
	public void leadFly(Fly fly) {// 所有会飞的东西都可以传入
		// 接口的引用可以指向实现类对象
		fly.fly();
	}

}

//实现接口，必须实现其中的所有抽象方法
//要么自己继续抽象下去
class Person implements Fly {

	@Override
	public void fly() {
		System.out.println("坐灰机");
	}

}

class Bird implements Fly {

	@Override
	public void fly() {
		System.out.println("翅膀飞");
	}
}

/*
 * 人和鸟都会飞
 */
interface Fly {
	// 接口中允许放静态常量,接口本身也是不能实例化的
	// 要表现接口中的行为，只有依靠实现类的对象
	public static final int a = 3;

	public abstract void fly();// 写在接口里的方法默认都是抽象的
//	public default void eat() {
//		System.out.println("ffff");
//	}
}
