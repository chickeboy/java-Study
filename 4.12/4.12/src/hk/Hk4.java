package hk;

import java.util.Scanner;

/*
 * ��a+aa+aaa+...����2+22+222+2222+22222��ǰn��֮��
 * 2+22+222+2222+22222
 * 2 * 10 + 2   22 * 10 + 2
 * 
 */
public class Hk4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������n��ֵ");
		int n = scanner.nextInt();
		System.out.println("������a��ֵ");
		int a = scanner.nextInt();
		double sum = 0;
		double num = a;
		for (int i = 0; i < n; i++) {
			sum = sum + num;
			num = num * 10 + a;
			System.out.println(num);
		}
		System.out.println(sum);
	}
}
