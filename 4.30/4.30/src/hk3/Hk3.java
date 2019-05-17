package hk3;

import java.util.Scanner;

/*
 * 设计一个产生女朋友的工厂(对你没有看错是女朋友)，并测试



	要求：



	1：设计BaseGF类，含有抽象无参方法 eat(),普通无参方法shopping(),



	2：三个子类分别继承BaseGF



	3：设计GFFactory类，含有静态方法:BaseGF createGF(String gfType)



	4：设计gfType判断，只能是，四川，广东，山东



	5：测试，分别创建三个类的对象，并调用对象的两个方法
 */
public class Hk3 {
	public static void main(String[] args) {
		GfFactory factory = new GfFactory();
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入地区");
		String name = scanner.next();
		Gf gf = factory.createGf(name);
		if (gf == null) {
			System.out.println("没有");
		} else {
			gf.shopping();
			gf.eat();
		}
	}
}

class GfFactory {
	public Gf createGf(String name) {
		Gf gf = null;
		switch (name) {
		case "四川":
			gf = new SiChuan(name + "妹子");
			break;
		case "山东":
			gf = new ShanDong(name + "妹子");
			break;
		case "广东":
			gf = new GuangDong(name + "妹子");
			break;
		default:
			break;
		}
		return gf;
	}
}

abstract class Gf {
	private String name;

	public abstract void shopping();

	public abstract void eat();

	public Gf(String name) {
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
		return "Gf [name=" + name + "]";
	}

}

class ShanDong extends Gf {

	public ShanDong(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void shopping() {
		System.out.println(getName() + "买大葱");
	}

	@Override
	public void eat() {
		System.out.println(getName() + "吃大葱");
	}

}

class GuangDong extends Gf {

	public GuangDong(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void shopping() {
		System.out.println(getName() + "买奶茶");
	}

	@Override
	public void eat() {
		System.out.println(getName() + "喝奶茶");
	}

}

class SiChuan extends Gf {

	public SiChuan(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void shopping() {
		System.out.println(getName() + "买辣椒");
	}

	@Override
	public void eat() {
		System.out.println(getName() + "吃辣椒");
	}

}
