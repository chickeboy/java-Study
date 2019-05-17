package hk;

import java.util.Scanner;

/*
 * 从键盘输入5个数存入一维数组中，
 * 将该数组中左半部分与右半部分的值平移交换
 * 后重新存入该数组中并输出
 * 1 2 3 4 5 6 7 
 * 4 5 3 1 2
 */
public class Hk6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] array = new double[5];
		for (int i = 0; i < array.length; i++) {
			System.out.println("请输入一个元素");
			array[i] = scanner.nextDouble();
		}
		for (int i = 0; i < array.length / 2; i++) {
			double temp = array[i];
			array[i] = array[i + (array.length + 1) / 2];
			array[i + (array.length + 1) / 2] = temp;
		}
	}
}
