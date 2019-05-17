package hk;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 创建一个数组存入5条数据，
 * 然后通过两种方式完成对数组的复制和输出
 */
public class Hk13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] a = new double[5];
		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入一个元素");
			a[i] = scanner.nextDouble();
		}
		double[] b = new double[a.length];
		// 1.手动赋值
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}
		// 利用Arrays.copy
		double[] c = Arrays.copyOf(a, a.length);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		// 第二种遍历方式 for each循环
		// 增强for循环
		// for(数组中存放的数据类型变量:数组源)
		for (double d : c) {
			System.out.println(d);// 数组中每个位置的值
			// 一遍用在输出
		}
	}
}
