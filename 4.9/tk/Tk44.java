package tk;

import java.util.Scanner;

/*
 * 键盘输入2个数,输出较大的一个数
 */
public class Tk4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数");
		int max = scanner.nextInt();// 假设第一个数是较大的
		System.out.println("请输入一个数");
		int num2 = scanner.nextInt();
		if (num2 > max) {//如果遇到实际情况第二个数要较大
			max = num2;
		}
		System.out.println("较大的数是..." + max);
		//max代表的就是较大的数

	}
}
