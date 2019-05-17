package hk;

import java.util.Scanner;

/*
 * 7.从键盘输入5个数存入一维数组中，
 * 求出所有元素的和，并且取平均值，并且输出
 */
public class Hk7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] a = new double[5];
		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入一个元素");
			a[i] = scanner.nextDouble();
		}
		double sum = 0;
		// 求和就是到数组每个位置上访问数据，然后累加
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		double avg = sum / a.length;
		System.out.println(avg);
	}
}
