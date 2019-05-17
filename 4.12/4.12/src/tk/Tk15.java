package tk;

import java.util.Scanner;

/*
 * 多重循环的逻辑训练
 * 双重循环 外循环控制行数 其实就是三角形的高
 * 内循环决定了一行有多少内容
 * 如何让每次内循环的次数都发生改变
 * 每次外循环结束后i是会变得
 * 内循环的j的取值范围要和i发生关系
 */
public class Tk15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入三角形的高");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
				// 不能换行，要等内循环执行完毕，也就是一行内容打印完毕才能换行
			}
			System.out.println();
		}
		System.out.println("===================");
		for (int i = 0; i < n; i++) {
			// 先打空格，再打*
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
				// 不能换行，要等内循环执行完毕，也就是一行内容打印完毕才能换行
			}
			System.out.println();
		}
		System.out.println("===================");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
