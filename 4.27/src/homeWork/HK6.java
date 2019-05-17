package homeWork;

import java.util.Scanner;

/*张三可以开关家里的任何电器，比如电灯、电视、电扇等。使用继承和多态来实现开关电器的方法。*/
public class HK6 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2 person = new Person2();
		person.otherChanger();
	}

}

class Person2 {
	private String name = "张三";
	public void otherChanger() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Electricalappliances electricalappliances = new Light("电灯", "关闭");
		Electricalappliances electricalappliances1 = new TV("电视", "关闭");
		Electricalappliances electricalappliances2 = new Electricfan("电扇", "关闭");
		Electricalappliances electricalappliances3 = new Airconditioning("空调", "关闭");
		System.out.println("======请选择张三的操作========");
		System.out.println("1.电灯");
		System.out.println("2.电视");
		System.out.println("3.电扇");
		System.out.println("4.空调");
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
		System.out.println(name + "使用了" + this.name);
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

