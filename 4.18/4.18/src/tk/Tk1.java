package tk;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 二分查找
 * 查找的数组源是经过排序的
 * 二维数组
 * 
 */
public class Tk1 {
	public static void main(String[] args) {
		int[] array = { 4, 1, 5, 6, 7, 2, 9, 11, 16 };
		// 1.先排序 1 24  5 6 7 9 11 16
		Arrays.sort(array);
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数");
		int num = scanner.nextInt();
		// 万一要查找的数在很后面，效率比较低
		int start = 0;// 起始点
		int end = array.length - 1;// 尾部下标
		int middle = 0;// 通过后续的(start + end) / 2
		// 这里的3个值代表的都是下标，循环过程中都有可能发生改变
		int index = -1;
		while (end >= start) {// ==最后一次
			middle = (start + end) / 2;// 获取中轴线下标
			if (num == array[middle]) {
				index = middle;
				break;
			} else if (num > array[middle]) {
				// 下一次循环应该是在middle下标的右边
				// 起始点就发生改变
				start = middle + 1;
			} else {
				// 在左边 end要变化
				end = middle - 1;
			}
		}
		if (index == -1) {
			System.out.println("没有这个数");
		} else {
			System.out.println("出现在第" + (index + 1) + "位");
		}

	}
}
