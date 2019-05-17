package hk2;

/*
 * 例题：



	定义一个抽象类，悍马车模型，具有行为：



	1.start()		启动车辆



	2.stop()		停止车辆



	3.alarm()		喇叭鸣叫



	4.engineBoom()	引擎发出轰鸣声



	5.run()		汽车跑起来



	分别生成两种不同的悍马车型，H1,H2实现悍马车具体的形式过程,使用抽象模板方法实现功能，5个方法都是抽象方法，最后的实现靠子类实现，在main方法中调用测试
 */
public class Hk2 {
	public static void main(String[] args) {
		Hummer hummer = new Hummer1("H1");
		hummer.running();
		hummer = new Hummer2("H2");
		hummer.running();
	}
}

abstract class Hummer {
	private String name;

	public Hummer(String name) {
		super();
		this.name = name;
	}

	public void start() {
		System.out.println(getName() + "启动");
	}

	public void end() {
		System.out.println(getName() + "结束");
	}

	public void alarm() {
		System.out.println(getName() + "按喇叭");
	}

	public abstract void engineBoom();

	public abstract void run();

	public void running() {
		start();
		engineBoom();
		alarm();
		run();
		end();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class Hummer1 extends Hummer {

	public Hummer1(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void engineBoom() {
		System.out.println(getName() + "bbbbbb");
	}

	@Override
	public void run() {
		System.out.println(getName() + "时速500");
	}

}

class Hummer2 extends Hummer {

	public Hummer2(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void engineBoom() {
		System.out.println(getName() + "dddddd");
	}

	@Override
	public void run() {
		System.out.println(getName() + "时速100");
	}

}
