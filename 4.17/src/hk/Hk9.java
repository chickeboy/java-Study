package hk;

import java.util.Scanner;

/*
 * 9.创建一个数组，长度为5，
 * 其中只能存放非负数，如果是负数，则提示无法录入，
 * 要求：用户一定要录满5个数据（保证数组中存满5个合法数据）
 */
public class Hk9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] a = new double[5];
		for (int i = 0; i < a.length;) {
			System.out.println("请输入一个元素");
			double num = scanner.nextDouble();
			if (num < 0) {// 不合法的
				// 不合法的话下标不能移动
				System.out.println("输入有误");
			} else {// 合法的
				a[i++] = num;
				// 符合要求对这个I号位赋值，下标并且移动
//				a[i] = num;	
//				i++;
			}
		}

	}
}
