package hk;

import java.util.Scanner;

/*
 * 从键盘输入5个数存入一维数组中，
 * 将下标为奇数的元素值取倒数后重新存入该数组中，并输出所有元素
 */
public class Hk1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] array = new double[5];
		for (int i = 0; i < args.length; i++) {
			System.out.println("请输入一个元素");
			array[i] = scanner.nextDouble();
		}
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 1) {
				array[i] = 1 / array[i];
			}
		}
	}
}
