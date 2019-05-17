package hk4;

import java.net.Socket;

/*
 * ģ��һ��������ս�����������и��ֱ�������������ȵȡ�
 * ÿ�ֱ��Ĺ������˷�ʽ��һ�����������ָ����ı�,����3��,
 * Ȼ����һ�����٣�����Ҳ���ϳ�ȥ�������ˣ�
 * ���Ǿ��ٻ���һ����Ϊ�����Ƿ��ţ����ٷ����ˣ�
 * ����ʲô����ȥս����������,Ҳ����ָ�����ֱ�ȥ�������ˡ�
 * ����������Ч������һ�����ٿ�ʼ���ţ�
 * Ȼ�����б�ָ����ʿ���������ٶ�ȥ����,��ʾÿ���˹������˵ķ�ʽ��
 */
public class Hk4 {
	public static void main(String[] args) {
		Commander commander = new Commander("����");
		Solider[] st = new Solider[3];
		st[0] = new Archer("����");
		st[1] = new FootMan("����");
		st[2] = new Rider("���");
		commander.command(st);
	}
}

class Commander extends Solider {

	public Commander(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void att() {
		System.out.println(getName() + "�ҽ���ͷ���");
	}

	public void command(Solider[] s) {
		att();
		for (int i = 0; i < s.length; i++) {
			s[i].att();
		}
	}

}

class Archer extends Solider {

	public Archer(String name) {
		super(name);
	}

	@Override
	public void att() {
		System.out.println(getName() + "���������");
	}

}

class Rider extends Solider {

	public Rider(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void att() {
		System.out.println(getName() + "������");
	}

}

class FootMan extends Solider {

	public FootMan(String name) {
		super(name);
	}

	@Override
	public void att() {
		System.out.println(getName() + "�ٶ�");
	}

}

abstract class Solider {
	private String name;

	public Solider(String name) {
		super();
		this.name = name;
	}

	public abstract void att();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Solider [name=" + name + "]";
	}

}
