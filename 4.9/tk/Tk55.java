package tk;

import java.util.Scanner;

/*
 * 键盘输入一个数，求出它的绝对值
 */
public class Tk5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数");
		int num = scanner.nextInt();
		int res = num;//作为绝对值出现的变量
		// 只要考虑负数
		if (num < 0) {
			res = -res;
		}
		System.out.println(num +"的绝对值是..." + res);
	}
}
