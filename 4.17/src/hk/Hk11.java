package hk;

import java.util.Random;

/*
 * 11.����һ�����飬���5��1-10���������
 * Ȼ�����������������3�ı�����ֹͣ
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
