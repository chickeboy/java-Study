package homeWork;

import java.util.Scanner;

/*模拟一个军队作战，军队里面有各种兵，骑兵，步兵等等。
每种兵的攻击敌人方式不一样。建立各种各样的兵,至少3种,
然后建立一个军官，军官也会上场去攻击敌人，
但是军官还有一种行为，就是发号，军官发号了，无论什么兵都去战场攻击敌人,
也可以指定哪种兵去攻击敌人。最后程序运行效果就是一个军官开始发号，
然后所有被指定的士兵包括军官都去打仗,显示每个人攻击敌人的方式。 */
public class hk4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===请选择兵种===");
		System.out.println("1.骑兵");
		System.out.println("2.步兵");
		System.out.println("3.特种兵");
		System.out.println("4.呼啦");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		if(a<=3) {
			Officer officer = new Officer();
			Army army = officer.officer(a);
			army.attack();
		}else {
			Army army[] = {new Cavalryman("骑兵","撞"), new Infantry("步兵","用枪打"),new Commando("特种兵","偷袭")};
			for (int i = 0; i < army.length; i++) {
				army[i].attack();
			}
		}
		
	}

}
class Officer{
	Army army = null;
	public Army officer(int a) {
		switch (a) {
		case 1:
			army = new Cavalryman("骑兵","撞");
			break;
		case 2:
			army = new Infantry("步兵","用枪打");
			break;
		case 3:
			army = new Commando("特种兵","偷袭");
			break;
		default:
			break;
		}
		return army;
	}
}
abstract class Army{
	private String name;
	private String attackpattern;
	abstract void attack();
	public Army(String name, String attackpattern) {
		super();
		this.name = name;
		this.attackpattern = attackpattern;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAttackpattern() {
		return attackpattern;
	}
	public void setAttackpattern(String attackpattern) {
		this.attackpattern = attackpattern;
	}
}
class Cavalryman extends Army{
	public Cavalryman(String name, String attackpattern) {
		super(name, attackpattern);
		// TODO Auto-generated constructor stub
	}

	@Override
	void attack() {
		// TODO Auto-generated method stub
		System.out.println(getName()+getAttackpattern()+"敌人");
	}
	
}
class Infantry extends Army{
	public Infantry(String name, String attackpattern) {
		super(name, attackpattern);
		// TODO Auto-generated constructor stub
	}

	@Override
	void attack() {
		// TODO Auto-generated method stub
		System.out.println(getName()+getAttackpattern()+"敌人");
	}
}
class Commando extends Army{
	public Commando(String name, String attackpattern) {
		super(name, attackpattern);
		// TODO Auto-generated constructor stub
	}

	@Override
	void attack() {
		// TODO Auto-generated method stub
		System.out.println(getName()+getAttackpattern()+"敌人");
	}
	
}

