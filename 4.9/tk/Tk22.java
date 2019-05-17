package tk;

import java.util.Scanner;

/*
 * 判断两个数之和是否大于100
 */
public class Tk2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入a");
		int a = scanner.nextInt();
		System.out.println("请输入b");
		int b = scanner.nextInt();
		int sum = a + b;
		if (sum > 100) {
			System.out.println(a + "+" + b + "的和大于100");
		} else {
			System.out.println("不大于100");
		}
	}
}
