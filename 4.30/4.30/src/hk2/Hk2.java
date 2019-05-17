package hk2;

/*
 * ���⣺



	����һ�������࣬����ģ�ͣ�������Ϊ��



	1.start()		��������



	2.stop()		ֹͣ����



	3.alarm()		��������



	4.engineBoom()	���淢��������



	5.run()		����������



	�ֱ��������ֲ�ͬ�ĺ����ͣ�H1,H2ʵ�ֺ����������ʽ����,ʹ�ó���ģ�巽��ʵ�ֹ��ܣ�5���������ǳ��󷽷�������ʵ�ֿ�����ʵ�֣���main�����е��ò���
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
		System.out.println(getName() + "����");
	}

	public void end() {
		System.out.println(getName() + "����");
	}

	public void alarm() {
		System.out.println(getName() + "������");
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
		System.out.println(getName() + "ʱ��500");
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
		System.out.println(getName() + "ʱ��100");
	}

}
