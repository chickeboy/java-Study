package homeWork;

import java.util.Scanner;

/*6.��дһ���������������2�����нϴ���������ҵ������3�����нϴ����*/
public class HK6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		System.out.println(compare(a,b));
		System.out.println(compare(compare(a,b),c));
	}
	public static int  compare(int a,int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}

}
