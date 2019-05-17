package hk3;

import java.util.Scanner;

/*
 * ���һ������Ů���ѵĹ���(����û�п�����Ů����)��������



	Ҫ��



	1�����BaseGF�࣬���г����޲η��� eat(),��ͨ�޲η���shopping(),



	2����������ֱ�̳�BaseGF



	3�����GFFactory�࣬���о�̬����:BaseGF createGF(String gfType)



	4�����gfType�жϣ�ֻ���ǣ��Ĵ����㶫��ɽ��



	5�����ԣ��ֱ𴴽�������Ķ��󣬲����ö������������
 */
public class Hk3 {
	public static void main(String[] args) {
		GfFactory factory = new GfFactory();
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������");
		String name = scanner.next();
		Gf gf = factory.createGf(name);
		if (gf == null) {
			System.out.println("û��");
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
		case "�Ĵ�":
			gf = new SiChuan(name + "����");
			break;
		case "ɽ��":
			gf = new ShanDong(name + "����");
			break;
		case "�㶫":
			gf = new GuangDong(name + "����");
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
		System.out.println(getName() + "����");
	}

	@Override
	public void eat() {
		System.out.println(getName() + "�Դ��");
	}

}

class GuangDong extends Gf {

	public GuangDong(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void shopping() {
		System.out.println(getName() + "���̲�");
	}

	@Override
	public void eat() {
		System.out.println(getName() + "���̲�");
	}

}

class SiChuan extends Gf {

	public SiChuan(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void shopping() {
		System.out.println(getName() + "������");
	}

	@Override
	public void eat() {
		System.out.println(getName() + "������");
	}

}
