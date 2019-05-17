package hk;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 7.有一个已经排好序的数组。现输入一个数，
 * 要求按原来的规律将它插入数组中。
 * 程序分析：首先判断此数是否大于最后一个数，
 * 如果大于最后一个数，则不插入。然后再考虑插入中间的数的情况，
 * 插入后此元素之后的数，依次后移一个位置
 */
public class Hk7 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 5, 7, 8 };
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数");
		int num = scanner.nextInt();
		if (num > array[array.length - 1]) {
			// 最后一个数就是最大的数
			System.out.println("不能插入");
		} else {
			array = Arrays.copyOf(array, array.length + 1);
			array[array.length - 1] = num;
			Arrays.sort(array);
		}
		for (int i : array) {
			System.out.println(i);
		}

	}
}
