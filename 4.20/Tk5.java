package tk;

import java.util.Scanner;

/*
 * 创建一个长度为4的数组
(1)编写一个方法，手动录入4条数据
(2)调用录入方法，键盘上输入一个数，查询是否存在，如果存在打印该数出现的下标位置，不存在则输出-1
(3)调用测试

 */
public class Tk5 {
	public static void main(String[] args) {
		int[] array = new int[4];
		init(array);
	}

	public static void init(int[] array) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < array.length;) {
			System.out.println("请输入一个数");
			int num = scanner.nextInt();
			if (indexOf(array, num, i) == -1) {
				array[i] = num;
				i++;
			} else {
				System.out.println("有重复元素");
			}
		}
		for (int i : array) {
			System.out.println(i);
		}
	}

	// 通过某个元素获取这个元素在数组中的下标值
	public static int indexOf(int[] array, int num, int size) {
		int index = -1;
		for (int i = 0; i < size; i++) {
			if (array[i] == num) {
				index = i;
				break;
			}
		}
		return index;
	}
}
