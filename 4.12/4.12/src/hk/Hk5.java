package hk;

import java.util.Scanner;

/*
 * 从键盘输入一个正整数，将该数前后倒置后输出
 */
public class Hk5 {
	public static void main(String[] args) {
		// 12345 1234 123 12 1
		System.out.println("请输入一个整数");
		int num2 = 0;
		int num = new Scanner(System.in).nextInt();
		for (; num > 0; num /= 10) {
			num2 = num2 * 10 + num % 10;
			System.out.println(num % 10);
		}
		System.out.println();
		System.out.println(num2);
	}
}
