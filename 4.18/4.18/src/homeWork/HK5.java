package homeWork;

import java.util.Scanner;

/*5.��дһ���������������2�����нϴ���������ҵ���������*/
public class HK5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(compare(a,b));

	}
	public static int  compare(int a,int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}

}
