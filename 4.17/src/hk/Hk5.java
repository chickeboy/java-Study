package hk;

import java.util.Scanner;

/*
 * 从键盘输入5个数存入一维数组中，
 * 将其中的值前后倒置后重新存入该数组中并输出
 * 1 2 3 4 5
 * 0 1 2 3 4 5
 * 5 4 3 2 1
 */
public class Hk5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] a = new double[5];
		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入一个元素");
			a[i] = scanner.nextDouble();
		}
		for (int i = 0; i < a.length / 2; i++) {
			double temp = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length - i - 1] = temp;
		}
	}
}
