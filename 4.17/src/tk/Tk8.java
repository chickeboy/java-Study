package tk;

import java.util.Random;

/*
 * ����һ����λ������������Գ����ظ�����
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
			// ��������ظ�����i�±겻Ӧ���ƶ�
			// ֪�����������������������λ��
		}
		for (int i : array) {
			System.out.println(i);
		}
	}
}
