package hk;

import java.util.Scanner;

/*
 * �Ӽ�������5��������һά�����У�
 * ����벿�ֵ�Ԫ��ֵȡ���������´���������У����������Ԫ�ء�
 * 0 1 2 3 4
 */
public class Hk2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] array = new double[5];
		for (int i = 0; i < array.length; i++) {
			System.out.println("������һ��Ԫ��");
			array[i] = scanner.nextDouble();
		}
		for (int i = 0; i < array.length / 2; i++) {
			array[i] = 1 / array[i];
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
