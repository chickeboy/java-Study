package homeWork;

/*定义一个抽象类，悍马车模型，具有行为： 
1.start() 启动车辆 
2.stop() 停止车辆 
3.alarm() 喇叭鸣叫 
4.engineBoom() 引擎发出轰鸣声 
5.run() 汽车跑起来 
分别生成两种不同的悍马车型，H1,H2实现悍马车具体的形式过程,
使用抽象模板方法实现功能，5个方法都是抽象方法，
最后的实现靠子类实现，在main方法中调用测试 */
public class hk2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 car = new H1();
		Car1 car2 = new H2();
		car.open();
		car2.open();
	}

}
abstract class Car1{
	abstract void start();
	abstract void stop();
	abstract void alarm();
	abstract void engineBoom();
	abstract void run();
	public void open() {
		start();
		engineBoom();
		run();
		alarm();
		stop();
	}
}
class H1 extends Car1{

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("开启车辆");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("停止车辆");
	}

	@Override
	void alarm() {
		// TODO Auto-generated method stub
		System.out.println("喇叭鸣叫 ");
	}

	@Override
	void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("引擎发出轰鸣声 ");
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("汽车跑起来 ");
	}
	
}
class H2 extends Car1{

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("开启车辆");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("停止车辆");
	}

	@Override
	void alarm() {
		// TODO Auto-generated method stub
		System.out.println("喇叭鸣叫 ");
	}

	@Override
	void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("引擎发出轰鸣声 ");
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("汽车跑起来 ");
	}
	
}