package homeWork;

/*ͨ�������ඨ�峵���ģ��,����һ�����󷽷�run()��
Ȼ��ͨ������ĳ���������������(Tractor)
������(Truck)��С�γ�(Saloon)��
�����и��Ե�run()����ʵ�� */ 
public class hk5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 car = new Tractor("������");
		Car2 car1 = new Tractor("����");
		Car2 car2 = new Tractor("С�γ�");
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
