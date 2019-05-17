package hk4;

import java.net.Socket;

/*
 * 模拟一个军队作战，军队里面有各种兵，骑兵，步兵等等。
 * 每种兵的攻击敌人方式不一样。建立各种各样的兵,至少3种,
 * 然后建立一个军官，军官也会上场去攻击敌人，
 * 但是军官还有一种行为，就是发号，军官发号了，
 * 无论什么兵都去战场攻击敌人,也可以指定哪种兵去攻击敌人。
 * 最后程序运行效果就是一个军官开始发号，
 * 然后所有被指定的士兵包括军官都去打仗,显示每个人攻击敌人的方式。
 */
public class Hk4 {
	public static void main(String[] args) {
		Commander commander = new Commander("军官");
		Solider[] st = new Solider[3];
		st[0] = new Archer("射手");
		st[1] = new FootMan("步兵");
		st[2] = new Rider("骑兵");
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
		System.out.println(getName() + "我将带头冲锋");
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
		System.out.println(getName() + "射就完事了");
	}

}

class Rider extends Solider {

	public Rider(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void att() {
		System.out.println(getName() + "策马奔腾");
	}

}

class FootMan extends Solider {

	public FootMan(String name) {
		super(name);
	}

	@Override
	public void att() {
		System.out.println(getName() + "举盾");
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
