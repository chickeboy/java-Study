package hk1;

/*
 *  �����ุ��Vehicle������ֽ�ͨ���ߣ�����Bike�����г�����
 *  Car��С�γ�����Train���𳵣��̳�Vehicle��
�����г����ʻ����drive()��������д�ṩʵ�֡�
Ҫ������������һ����ͨ�������飬�������ཻͨ���ߣ�����ʻ���ǡ�
 */
public class Hk1 {
	public static void main(String[] args) {
		Vehicle[] v = new Vehicle[3];
		v[0] = new Car("����");
		v[1] = new Bike("���г�");
		v[2] = new Train("��");
		//Vehicle v = new ����
		for (int i = 0; i < v.length; i++) {
			v[i].dirve();// ֻ���Ǹ���̳и�����ķ���
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
		System.out.println(getName() + "ʱ��300");
	}

}

class Train extends Vehicle {

	public Train(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dirve() {
		System.out.println(getName() + "ʱ��350");
	}

}

class Bike extends Vehicle {

	public Bike(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dirve() {
		System.out.println(getName() + "ʱ��100");
	}

}
