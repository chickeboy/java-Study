package hk;
//4.求a+aa+aaa+...（如2+22+222+2222+22222）前n项之和;

import java.util.Scanner;

public class Hk4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数值");
		int n = scanner.nextInt();
		double sum = 0;
		int a = n;
		double b = 0;
		for (int i = 1; i <= n; i++) {
			b = b + a * Math.pow(10, (i - 1));
			sum = sum + b;
		}
		System.out.println(sum);
	}
}
