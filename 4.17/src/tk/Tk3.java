package tk;

/*
 * 选择排序
 * 每次内循环负责把最小的数移动到本次循环的第一位下标
 * 内循环先把第一位的数去和后面所有的数比小
 * 如果发现有一个数比这个数要小，不急着交换，记录这个数的下标
 * 我们就是要创建一个变量min负责记录最小数的下标
 * 最后比完一轮，才交换值，将最小的数放到第一位
 */
public class Tk3 {
	public static void main(String[] args) {
		int[] array = { 5, 3, 1, 2, 7 };
		for (int i = 0; i < array.length - 1; i++) {
			int min = i;// 假设第i位是最小数的下标
			for (int j = i + 1; j < array.length; j++) {
				if (array[min] > array[j]) {
					min = j;// 记录下最小数的下标
				}
			} // 内循环结束了
			if (min != i) {// 防止第一位正好是最小的
				int temp = array[i];
				array[i] = array[min];
				array[min] = temp;
			}
		}
		for (int i : array) {
			System.out.println(i);
		}
	}
}
