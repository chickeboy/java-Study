package homeWork;

/*通过抽象类定义车类的模版,定义一个抽象方法run()，
然后通过抽象的车类来派生拖拉机(Tractor)
、卡车(Truck)、小轿车(Saloon)，
并且有各自的run()方法实现 */ 
public class hk5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 car = new Tractor("拖拉机");
		Car2 car1 = new Tractor("卡车");
		Car2 car2 = new Tractor("小轿车");
		car.start();
		car1.start();
		car2.start();
	}

}
abstract class Car2{
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car2(String name) {
		super();
		this.name = name;
	}

	abstract void run();
	public  void  start() {
		run();
	}
}
class Tractor extends Car2{

	public Tractor(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"run()");
	}
	
}
class Truck extends Car2{

	public Truck(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"run()");
	}
	
}
class Saloon extends Car2{

	public Saloon(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"run()");
	}
	
}
