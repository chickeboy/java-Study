package HK6;

import java.util.Scanner;

public class Select {
	int index = 1;
	int count = 0;
	int count2 = 0;
	public void name() {	
		Play play = new Play();
		Output output = new Output();
		System.out.println("��ȭ����1.����  2.ʯͷ  3.��");
		System.out.print("������Է���ɫ��1.����  2.��Ȩ  3.�ܲ� :");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println("�������������:");
		String str = scanner.next();
		System.out.println(str);
		String str2 = play.play(a);
		System.out.println(str + "   vs  "+str2);
		System.out.print("Ҫ��ʼ�𣿣�y/n��");
		String str3 = scanner.next();
		if(str3.equals("y")) {	
			play.name1();
			if (play.index()==2) {
				System.out.println("�������true");
				count+=1;
			}else if (play.index()==1){
				count2+=1;
				System.out.println("�������false");
			}
			while(true) {	
				System.out.print("�Ƿ�ʼ��һ�֣���y/n��");
				str3 = scanner.next();
				if(str3.equals("y")) {
					play.name1();
					if (play.index()==2) {
						System.out.println("�������true");
						count+=1;
					}else if (play.index()==1){
						count2+=1;
						System.out.println("�������false");
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
