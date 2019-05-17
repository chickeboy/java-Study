package HK6;

import java.util.Scanner;

public class Play {
	int a;
	int b;
	String name;
	Judge judge = new Judge();
	
	
	public void name1() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请出拳：1.剪刀  2.石头  3.布（输入相应的数字）：");
		a = scanner.nextInt();
		System.out.println("你出拳："+name2(a));
		b = (int)Math.floor(Math.random()*2+1);
		System.out.println(name+"出拳:"+name2(b));		
		System.out.println("结果说:"+judge.judge(a,b));
		
	}
	
	public String play(int a) {
		if(a==1) {
			this.name = "刘备";
			return name;
		}else if(a==2){
			this.name = "孙权";
			return name;
		}else {
			this.name = "曹操";
			return name;
		}
	}
	
	public int index() {
		return judge.judge1(a, b);
	}
	public String name2(int a) {
		
		if(a==1) {
			return "剪刀";
		}else if (a==2) {
			return "石头";
		}else {
			return "布";
		}
		
	}
}
