package hk;

import java.util.Random;

/*
 * 11.创建一个数组，存放5个1-10的随机数，
 * 然后遍历输出，如果遇到3的倍数就停止
 */
public class Hk11 {
	public static void main(String[] args) {
		int[] array = new int[5];
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10) + 1;
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 3 == 0) {
				break;
			} else {
				System.out.println(array[i]);
			}
		}
	}
}
