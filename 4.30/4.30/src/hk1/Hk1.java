package hk1;

/*
 *  抽象类父类Vehicle代表各种交通工具，子类Bike（自行车）、
 *  Car（小轿车）、Train（火车）继承Vehicle。
父类有抽象驾驶方法drive()，子类重写提供实现。
要求主方法产生一个交通工具数组，包含各类交通工具，并驾驶它们。
 */
public class Hk1 {
	public static void main(String[] args) {
		Vehicle[] v = new Vehicle[3];
		v[0] = new Car("汽车");
		v[1] = new Bike("自行车");
		v[2] = new Train("火车");
		//Vehicle v = new 子类
		for (int i = 0; i < v.length; i++) {
			v[i].dirve();// 只能是父类继承给子类的方法
		}
	}
}

abstract class Vehicle {
	private String name;

	public abstract void dirve();

	public Vehicle(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + "]";
	}

}

class Car extends Vehicle {

	public Car(String name) {
		super(name);
	}

	@Override
	public void dirve() {
		System.out.println(getName() + "时速300");
	}

}

class Train extends Vehicle {

	public Train(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dirve() {
		System.out.println(getName() + "时速350");
	}

}

class Bike extends Vehicle {

	public Bike(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dirve() {
		System.out.println(getName() + "时速100");
	}

}
