package hk;

import java.util.Scanner;

/*
 * ��һ�����У�8��4��2��1��23��344��12
ѭ��������е�ֵ
��������������ֵ�ĺ�
������Ϸ���Ӽ�������������һ�����ݣ��ж��������Ƿ��������
 */
public class Hk5 {
	public static void main(String[] args) {
		int[] array = { 8, 4, 2, 1, 23, 344, 12 };
		double sum = 0;
		for (int i : array) {// ����Ҫ�±���ܱ�������
			System.out.println(i);// i �ͺ�֮ǰ��array[i]
			// һ��������������Ԫ����
			sum += i;
		}
		System.out.println("��Ϊ" + sum);
		System.out.println("������һ����");
		int num = new Scanner(System.in).nextInt();
		int index = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				index = i;
				break;
			}
		}
		if (index != -1) {
			System.out.println(num + "�����ڵ�" + (index + 1) + "λ");
		} else {
			System.out.println(num + "������");
		}
	}
}
