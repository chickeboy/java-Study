package tk;

/*
 * 下午的内容：
 * 数组的排序
 * 冒泡排序，选择排序
 * 数组的排序：就是根据一定的顺序，对数组中每个
 * 下标对应位置上的数做交换
 * 
 * 数组的查询
 */
public class Tk2 {
	public static void main(String[] args) {
		int[] array = { 2, 4, 41, 5, 6, 7 };
		// 冒泡的上浮法，每次排序将最大的数移动到最后一位
		// 使用的是双重循环，外循环控制总的流程次数
		// 内循环控制每次将一个最大的数移动到最后一位
		// 外循环次数比长度小1，最后一次不需要移动数据
		// 每次比价规则，下标的前一位和后一位进行比较
		// 如果后一位要小，那么这2个位置上的值交换
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				// i每次递增，j的取值范围会小1
				// 内循环每次会使下标归0，这个下标是j
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		for (int i : array) {
			// i代表的是数组每个位置上的具体元素
			System.out.println(i);
		}
	}
}
