package hk;

/*
 * 使用数组存入斐波那契数列的前10项值，然后遍历输出
 * 1 1 2 3 
 */
public class Hk12 {
	public static void main(String[] args) {
		int[] array = new int[10];
		// 1.第一个和第二数必须赋值
		array[0] = 1;
		array[1] = 1;
		for (int i = 2; i < array.length; i++) {
			array[i] = array[i - 1] + array[i - 2];
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
