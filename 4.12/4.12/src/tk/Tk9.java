package tk;

import java.util.Scanner;

/*
 * 从键盘输入一个正整数，将该数前后倒置后输出
 */
public class Tk9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个正整数");
		int num = scanner.nextInt();
		while (num > 0) {
			System.out.println(num % 10);
			num /= 10;
		}
	}
}
