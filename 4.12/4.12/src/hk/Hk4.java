package hk;

import java.util.Scanner;

/*
 * 求a+aa+aaa+...（如2+22+222+2222+22222）前n项之和
 * 2+22+222+2222+22222
 * 2 * 10 + 2   22 * 10 + 2
 * 
 */
public class Hk4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入n的值");
		int n = scanner.nextInt();
		System.out.println("请输入a的值");
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
