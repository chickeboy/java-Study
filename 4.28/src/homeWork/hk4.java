package homeWork;

import java.util.Scanner;

/*ģ��һ��������ս�����������и��ֱ�������������ȵȡ�
ÿ�ֱ��Ĺ������˷�ʽ��һ�����������ָ����ı�,����3��,
Ȼ����һ�����٣�����Ҳ���ϳ�ȥ�������ˣ�
���Ǿ��ٻ���һ����Ϊ�����Ƿ��ţ����ٷ����ˣ�����ʲô����ȥս����������,
Ҳ����ָ�����ֱ�ȥ�������ˡ�����������Ч������һ�����ٿ�ʼ���ţ�
Ȼ�����б�ָ����ʿ���������ٶ�ȥ����,��ʾÿ���˹������˵ķ�ʽ�� */
public class hk4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===��ѡ�����===");
		System.out.println("1.���");
		System.out.println("2.����");
		System.out.println("3.���ֱ�");
		System.out.println("4.����");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		if(a<=3) {
			Officer officer = new Officer();
			Army army = officer.officer(a);
			army.attack();
		}else {
			Army army[] = {new Cavalryman("���","ײ"), new Infantry("����","��ǹ��"),new Commando("���ֱ�","͵Ϯ")};
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
			army = new Cavalryman("���","ײ");
			break;
		case 2:
			army = new Infantry("����","��ǹ��");
			break;
		case 3:
			army = new Commando("���ֱ�","͵Ϯ");
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
		System.out.println(getName()+getAttackpattern()+"����");
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
		System.out.println(getName()+getAttackpattern()+"����");
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
		System.out.println(getName()+getAttackpattern()+"����");
	}
	
}

