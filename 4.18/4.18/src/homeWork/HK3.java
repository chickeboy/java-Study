package homeWork;

import java.util.Scanner;

/*��дһ���������������2�����ĺͣ����ҵ������3�����ĺ�*/
public class HK3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(a + "+" + b + "=" + sum(a, b));
		System.out.println(sum(a, b) + "+" + b + "=" + sum(sum(a, b), b));
	}
	public static int sum(int a, int b) {
		return a + b;
	}
}
