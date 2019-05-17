package homeWork;
/*抽象类父类Vehicle代表各种交通工具，
子类Bike（自行车）、Car（小轿车）、
Train（火车）继承Vehicle。 
父类有抽象驾驶方法drive()，子类重写提供实现。 
要求主方法产生一个交通工具数组，包含各类交通工具，并驾驶它们。*/
public class hk1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle array[] = {new Bike(),new Car(),new Train()};
		for(int i =0;i<array.length;i++) {
			array[i].drive();
		}
	}
}
abstract class Vehicle {
	abstract void drive();
}
class Bike extends Vehicle{

	@Override
	void drive() {
		// TODO Auto-generated method stub
		System.out.println("骑车");
	}
	
}
class Car extends Vehicle{

	@Override
	void drive() {
		// TODO Auto-generated method stub
		System.out.println("开汽车");
	}
	
}
class Train extends Vehicle{

	@Override
	void drive() {
		// TODO Auto-generated method stub
		System.out.println("开火车");
	}
	
}