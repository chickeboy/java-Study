package HK6;

import java.util.Scanner;

public class Select {
	int index = 1;
	int count = 0;
	int count2 = 0;
	public void name() {	
		Play play = new Play();
		Output output = new Output();
		System.out.println("出拳规则：1.剪刀  2.石头  3.布");
		System.out.print("请输入对方角色：1.刘备  2.孙权  3.曹操 :");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println("请输入你的姓名:");
		String str = scanner.next();
		System.out.println(str);
		String str2 = play.play(a);
		System.out.println(str + "   vs  "+str2);
		System.out.print("要开始吗？（y/n）");
		String str3 = scanner.next();
		if(str3.equals("y")) {	
			play.name1();
			if (play.index()==2) {
				System.out.println("输出的是true");
				count+=1;
			}else if (play.index()==1){
				count2+=1;
				System.out.println("输出的是false");
			}
			while(true) {	
				System.out.print("是否开始下一轮？（y/n）");
				str3 = scanner.next();
				if(str3.equals("y")) {
					play.name1();
					if (play.index()==2) {
						System.out.println("输出的是true");
						count+=1;
					}else if (play.index()==1){
						count2+=1;
						System.out.println("输出的是false");
					}
					index++;
				}else if (str3.equals("n")) {
					output.out(count,count2,index,str, str2);
					break;
				}
			}
		}
	}
}
