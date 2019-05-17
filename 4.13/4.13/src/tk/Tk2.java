package tk;

import java.util.Scanner;

/*
 * 数组的赋值和遍历输出
 */
public class Tk2 {
	public static void main(String[] args) {
		// int[] array = { 2, 4, 5 };
//		System.out.println(array[0]);
//		System.out.println(array[1]);
//		System.out.println(array[2]);

		// 数组名[下标] 直接可以访问到这个位置上的值
		// System.out.println(array[4]);不能访问没有的位置
		// 语法通过，
		int[] array = new int[5];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("请输入一个数");
			int num = scanner.nextInt();
			// 对数组的每一个位置进行赋值
			array[i] = num;// array[i]在左边代表的是数组内存位置
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);// 代表的是i号位上存放的常量值
		}
		int a = 3;
		System.out.println(a);
		System.out.println(array[0]);// 打印出的是引用
		// 数组是引用数据类型 new的东西都在堆内存中
	}
}
