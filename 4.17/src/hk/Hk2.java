package hk;

import java.util.Scanner;

/*
 * 从键盘输入5个数存入一维数组中，
 * 将左半部分的元素值取倒数后重新存入该数组中，并输出所有元素。
 * 0 1 2 3 4
 */
public class Hk2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] array = new double[5];
		for (int i = 0; i < array.length; i++) {
			System.out.println("请输入一个元素");
			array[i] = scanner.nextDouble();
		}
		for (int i = 0; i < array.length / 2; i++) {
			array[i] = 1 / array[i];
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
