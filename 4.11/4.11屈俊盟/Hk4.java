package hk;
//4.��a+aa+aaa+...����2+22+222+2222+22222��ǰn��֮��;

import java.util.Scanner;

public class Hk4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ����ֵ");
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
