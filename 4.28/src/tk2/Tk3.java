package tk2;

import java.util.Scanner;

/*
 * ��̬�ͳ�����Ľ��ʹ��
 * ��̬���и�����Ϊ�������ֵĵط�һ��������
 * ����Ķ���ȥ����
 * �и�����Ϊ����ֵ�ĵط�����ͨ����������Ķ���
 * ȥ���ж�̬��չ��
 * ����ģʽ:��һ������Ĵ���ϸ�ڽ��з�װ��������ֻ��Ҫ����
 * ��Ҫ�����Ķ�����������ַ������Ϳ��Ի�ȡ����������Ķ���
 * Ů�����
 * ¯�ӿ����� ����
 * ¯��û���� ����
 * ������������ ������
 */
public class Tk3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ҫʲô����");
		String name = scanner.next();
		HumanFactory factory = new HumanFactory();
		NvWa nvWa = new NvWa(factory);
		Human human = nvWa.create(name);// ��������Ķ���
		if (human == null) {
			System.out.println("û���������");
		} else {
			human.showSelf();
			human.talk();
		}
	}
}

//������
class NvWa {
	public HumanFactory factory;

	public NvWa(HumanFactory factory) {
		super();
		this.factory = factory;
	}

	public Human create(String name) {
		return factory.createHuman(name);
	}
}

//¯�� ����
class HumanFactory {
	public Human createHuman(String name) {
		Human human = null;// �������Ǹ��������
		switch (name) {
		case "����":
			human = new BlackHuman(name, "��ɫ");
			break;
		case "����":
			human = new WhiteHuman(name, "��ɫ");
			break;
		case "������":
			human = new YellowHuman(name, "��ɫ");
			break;
		default:
			break;
		}
		return human;
	}
}

abstract class Human {
	private String name;
	private String colour;

	public Human(String name, String colour) {
		super();
		this.name = name;
		this.colour = colour;
	}

	// δ֪����Ϊ�ȴ�����ȥʵ��
	public abstract void talk();

	public abstract void showSelf();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}

class WhiteHuman extends Human {

	public WhiteHuman(String name, String colour) {
		super(name, colour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void talk() {
		System.out.println(getName() + "hello");
	}

	@Override
	public void showSelf() {
		System.out.println(getName() + getColour() + "���˾���Ͱ͵�");
	}

}

class YellowHuman extends Human {

	public YellowHuman(String name, String colour) {
		super(name, colour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void talk() {
		System.out.println(getName() + "˵����");
	}

	@Override
	public void showSelf() {
		System.out.println(getName() + getColour() + "�ҵ�Ƥ����ϸ��");
	}

}

class BlackHuman extends Human {

	public BlackHuman(String name, String colour) {
		super(name, colour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void talk() {
		System.out.println(getName() + "���������޵�wid");
	}

	@Override
	public void showSelf() {
		System.out.println(getName() + getColour() + "�㿴������");
	}

}
