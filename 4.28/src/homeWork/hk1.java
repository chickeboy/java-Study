package homeWork;
/*�����ุ��Vehicle������ֽ�ͨ���ߣ�
����Bike�����г�����Car��С�γ�����
Train���𳵣��̳�Vehicle�� 
�����г����ʻ����drive()��������д�ṩʵ�֡� 
Ҫ������������һ����ͨ�������飬�������ཻͨ���ߣ�����ʻ���ǡ�*/
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
		System.out.println("�ﳵ");
	}
	
}
class Car extends Vehicle{

	@Override
	void drive() {
		// TODO Auto-generated method stub
		System.out.println("������");
	}
	
}
class Train extends Vehicle{

	@Override
	void drive() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}
	
}