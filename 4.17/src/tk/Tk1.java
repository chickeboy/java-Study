package tk;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 数组的实际元素个数和数组的长度的区别
 */
public class Tk1 {
	public static void main(String[] args) {
		int[] array = new int[5];
		// array.length 这个东西代表的是容器的长度
		// 当我们录入的数据超过了5条
		Scanner scanner = new Scanner(System.in);
		int size = 0;// 数组中存放的实际元素个数
		while (true) {

			System.out.println("请输入一个数");
			array[size] = scanner.nextInt();
			size++;
			// 先对size(0)赋值，然后数量+1
			if (size == array.length) {
				// 如果数组中实际元素个数==数组的长度
				// 表示数组数据存满，需要扩容
				// 但是数组本身是不能改变长度
				array = Arrays.copyOf(array, size * 2 + 1);
			}
			System.out.println("请问是否要继续");
			String choice = scanner.next();
			if (choice.equals("n")) {
				break;
			}
		}
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
	}
}
