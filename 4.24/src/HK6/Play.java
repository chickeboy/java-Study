package HK6;

import java.util.Scanner;

public class Play {
	int a;
	int b;
	String name;
	Judge judge = new Judge();
	
	
	public void name1() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���ȭ��1.����  2.ʯͷ  3.����������Ӧ�����֣���");
		a = scanner.nextInt();
		System.out.println("���ȭ��"+name2(a));
		b = (int)Math.floor(Math.random()*2+1);
		System.out.println(name+"��ȭ:"+name2(b));		
		System.out.println("���˵:"+judge.judge(a,b));
		
	}
	
	public String play(int a) {
		if(a==1) {
			this.name = "����";
			return name;
		}else if(a==2){
			this.name = "��Ȩ";
			return name;
		}else {
			this.name = "�ܲ�";
			return name;
		}
	}
	
	public int index() {
		return judge.judge1(a, b);
	}
	public String name2(int a) {
		
		if(a==1) {
			return "����";
		}else if (a==2) {
			return "ʯͷ";
		}else {
			return "��";
		}
		
	}
}
