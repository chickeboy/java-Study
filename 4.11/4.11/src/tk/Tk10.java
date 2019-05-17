package tk;

import java.util.Scanner;

/*
 * 用循环程序求某一个数的阶乘
 */
public class Tk10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数");
		int num = scanner.nextInt();
		double sum = 1;// 求积的情况初始值不能是0 
		for (int i = num; i > 0; i--) {
			sum *= i;
		}
		System.out.println(sum);
	}
}
