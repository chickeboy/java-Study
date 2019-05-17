package hk;

import java.util.Scanner;

/*
 * 创建一个数组，长度为10，要求用户录一条数据后，
 * 询问是否要继续，最后遍历输出
 */
public class Hk10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] a = new double[10];
		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入一个元素");
			a[i] = scanner.nextDouble();
			if (i < 9) {
				System.out.println("是否要继续");
				String choice = scanner.next();
				if (choice.equals("不是")) {
					break;// 跳出循环
				}
			} else {
				System.out.println("数组已满");
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
