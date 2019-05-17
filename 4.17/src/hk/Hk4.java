package hk;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 从键盘输入5个数存入一维数组a中，
 * 再将其中的值按相反的顺序存入数组b中并输出
 */
public class Hk4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] a = new double[5];
		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入一个元素");
			a[i] = scanner.nextDouble();
		}
		double[] b = new double[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[a.length - i - 1];
		}
		// 通过下标截取获取数组内容
		// b = Arrays.copyOfRange(a, a.length - 1, 0);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
