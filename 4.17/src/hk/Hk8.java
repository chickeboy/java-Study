package hk;

import java.util.Scanner;

/*
 * 8.数组中存入5个数，计算出所有偶数的个数和奇数的个数
 */
public class Hk8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] a = new double[5];
		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入一个元素");
			a[i] = scanner.nextDouble();
		}
		int num1 = 0;
		int num2 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				num2++;
			} else {
				num1++;
			}
		}
		System.out.println(num1);
		System.out.println(num2);
	}
}
