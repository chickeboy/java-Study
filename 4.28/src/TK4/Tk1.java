package TK4;

import java.util.Scanner;

/*��дһ�³�����Ҫ������һ���ֻ��������ƿ���ͨ�����ƻ�ȡ���ֲ�ͬ�ֻ�����������ͨ���ƶ���*/
public class Tk1 {
	public static void main(String[] args) {
		System.out.println("��������Ҫ�ĵ绰������");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		Faactory faactory = new Faactory(str);
		faactory.creat();
		if(str==null) {
			System.out.println("������Ŀ�����");
		}else {
			
		}
		
	}
}
