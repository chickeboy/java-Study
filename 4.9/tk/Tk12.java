package tk;

import java.util.Scanner;

/*
 * 键盘输入3个数，求出其中最大的数
 */
public class Tk12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数");
		int max = scanner.nextInt();
		System.out.println("请输入一个数");
		int num2 = scanner.nextInt();
		max = max < num2 ? num2 : max;
		System.out.println("请输入一个数");
		num2 = scanner.nextInt();
		max = max < num2 ? num2 : max;
		System.out.println(max);
	}
}
