package homeWork;

import java.util.Scanner;

/*�������Կ��ؼ�����κε����������ơ����ӡ����ȵȡ�ʹ�ü̳кͶ�̬��ʵ�ֿ��ص����ķ�����*/
public class HK6 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2 person = new Person2();
		person.otherChanger();
	}

}

class Person2 {
	private String name = "����";
	public void otherChanger() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Electricalappliances electricalappliances = new Light("���", "�ر�");
		Electricalappliances electricalappliances1 = new TV("����", "�ر�");
		Electricalappliances electricalappliances2 = new Electricfan("����", "�ر�");
		Electricalappliances electricalappliances3 = new Airconditioning("�յ�", "�ر�");
		System.out.println("======��ѡ�������Ĳ���========");
		System.out.println("1.���");
		System.out.println("2.����");
		System.out.println("3.����");
		System.out.println("4.�յ�");
		int a = scanner.nextInt();
		switch (a) {
		case 1:
			change(electricalappliances);
		case 2:
			change(electricalappliances1);
		case 3:
			change(electricalappliances2);
		case 4:
			change(electricalappliances3);
		default:
			break;
		}
	}
	public void change(Electricalappliances electricalappliances) {
			electricalappliances.outPut(name);
			otherChanger();
	}
}

class Electricalappliances {
	private String name;
	private String state;
	public Electricalappliances(String name, String state) {
		super();
		this.name = name;
		this.state = state;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void outPut(String name) {
		System.out.println(name + "ʹ����" + this.name);
	}
}

class Light extends Electricalappliances {

	public Light(String name, String state) {
		super(name, state);
		// TODO Auto-generated constructor stub
	}
}
class TV extends Electricalappliances{

	public TV(String name, String state) {
		super(name, state);
		// TODO Auto-generated constructor stub
	}
	
}
class Electricfan extends Electricalappliances{

	public Electricfan(String name, String state) {
		super(name, state);
		// TODO Auto-generated constructor stub
	}
	
}
class Airconditioning extends Electricalappliances{

	public Airconditioning(String name, String state) {
		super(name, state);
		// TODO Auto-generated constructor stub
	}
	
}

