package homeWork;

/*����һ�������࣬����ģ�ͣ�������Ϊ�� 
1.start() �������� 
2.stop() ֹͣ���� 
3.alarm() �������� 
4.engineBoom() ���淢�������� 
5.run() ���������� 
�ֱ��������ֲ�ͬ�ĺ����ͣ�H1,H2ʵ�ֺ����������ʽ����,
ʹ�ó���ģ�巽��ʵ�ֹ��ܣ�5���������ǳ��󷽷���
����ʵ�ֿ�����ʵ�֣���main�����е��ò��� */
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
		System.out.println("��������");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("ֹͣ����");
	}

	@Override
	void alarm() {
		// TODO Auto-generated method stub
		System.out.println("�������� ");
	}

	@Override
	void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("���淢�������� ");
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("���������� ");
	}
	
}
class H2 extends Car1{

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("��������");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("ֹͣ����");
	}

	@Override
	void alarm() {
		// TODO Auto-generated method stub
		System.out.println("�������� ");
	}

	@Override
	void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("���淢�������� ");
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("���������� ");
	}
	
}