package homeWork;

import java.util.Scanner;

/*2.��дһ���������������2�����ĺͣ����ҵ���������*/
public class HK2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(a + "+" + b + "=" + sum(a, b));
	}

	public static int sum(int a, int b) {
		return a + b;
	}

}
