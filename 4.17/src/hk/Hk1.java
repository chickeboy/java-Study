package hk;

import java.util.Scanner;

/*
 * �Ӽ�������5��������һά�����У�
 * ���±�Ϊ������Ԫ��ֵȡ���������´���������У����������Ԫ��
 */
public class Hk1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] array = new double[5];
		for (int i = 0; i < args.length; i++) {
			System.out.println("������һ��Ԫ��");
			array[i] = scanner.nextDouble();
		}
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 1) {
				array[i] = 1 / array[i];
			}
		}
	}
}
