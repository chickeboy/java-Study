package tk;

/*
 * 创建一个数组，录入5条数据，求出其中的最大值和最小值
 */
public class Tk4 {
	public static void main(String[] args) {
		int[] array = { -1, -2, -3, -5, -9 };
		//
		int max = array[0];
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = i;
			}
		}
	}
}
