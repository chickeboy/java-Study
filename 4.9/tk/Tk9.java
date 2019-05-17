package tk;

import java.util.Scanner;

/*
 * 判断三个数之积是否小于50或大于100
 */
public class Tk9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数");
		int a = scanner.nextInt();
		System.out.println("请输入一个数");
		int b = scanner.nextInt();
		System.out.println("请输入一个数");
		int c = scanner.nextInt();
		int sum = a * b * c;
		if (sum > 100 || sum < 50) {
			System.out.println("符合要求");
		} else {
			System.out.println("不符合要求");
		}
	}
}
