package hk;

import java.util.Scanner;

/*
 * �Ӽ�������5��������һά�����У�
 * ���Ұ벿�ֵ�Ԫ��ֵȡ�෴�������´���������У�
 * ���������Ԫ��
 * 0 1 2
 */
public class Hk3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] array = new double[5];
		for (int i = 0; i < array.length; i++) {
			System.out.println("������һ��Ԫ��");
			array[i] = scanner.nextDouble();
		}
		for (int i = (array.length + 1) / 2; i < array.length; i++) {
			array[i] = -array[i];
			// ż�����Ⱥ��������� ��ʼλ���㷨
		}
	}
}
