package tk;

import java.util.Random;

/*
 * 生成一个四位随机数，不可以出现重复数字
 */
public class Tk8 {
	public static void main(String[] args) {
		int[] array = new int[4];
		Random random = new Random();
		for (int i = 0; i < array.length;) {
			int num = random.nextInt(10);
			boolean flag = true;
			for (int j = 0; j < i; j++) {
				if (num == array[j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				array[i] = num;
				i++;
			}
			// 如果出现重复数据i下标不应该移动
			// 知道出现满足存入条件的数字位置
		}
		for (int i : array) {
			System.out.println(i);
		}
	}
}
