import java.util.Scanner;

/*9.ģ����������������3�����⣬ʵ��׼���ô𰸣��ǻ��߷񼴿ɣ������ͳ�Ƹ��û�����˼���*/
public class Hk9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str;
		int temp = 0;
		char ch;
		System.out.println("5>4?");
		str = scanner.next();
		 ch = str.charAt(0);
		if (ch == '��') {
			temp += 1;
		}
		System.out.println("5<4?");
		str = scanner.next();
		 ch = str.charAt(0);
		if (ch == '��') {
			temp += 1;
		}
		System.out.println("4<10?");
		str = scanner.next();
		 ch = str.charAt(0);
		if (ch == '��') {
			temp += 1;
		}
		System.out.println("������" + temp + "����");
	}

}
