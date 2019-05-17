package tk;

import java.util.Scanner;

/*
 * 知识点：
 * if else if的嵌套使用
 * 以及多条件判断语句的使用
 */
public class Tk7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数");
		int num = scanner.nextInt();
		// 判断一个数是正数，负数，或者0 这个时候有3种选择
		if (num > 0) {
			System.out.println(">0");
		}
		if (num == 0) {
			System.out.println("=0");
		}
		if (num < 0) {
			System.out.println("<0");
		}
		if (num > 0) {
			System.out.println(">0");
		} else {
			// 小于和等于的情况都在里面
			if (num < 0) {
				System.out.println("<0");
			} else {
				System.out.println("=0");
			}
		}
		int a = 0;// 变量的声明
		// System.out.println(a);// 变量申请的时候没有赋值，无法直接使用
		// final修饰变量，表示这个变量不可再次赋值
		int c = 3;
		int d = 4;
		if (c < d) {
			a = 10;
		} else {
			if (c > d) {
				a = 11;
			} else {
				a = 12;
			}
		}
		System.out.println(a);
	}
}
