package hk;

import java.util.Scanner;

/*
 * �Ӽ�������5��������һά�����У�
 * ������������벿�����Ұ벿�ֵ�ֵƽ�ƽ���
 * �����´���������в����
 * 1 2 3 4 5 6 7 
 * 4 5 3 1 2
 */
public class Hk6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] array = new double[5];
		for (int i = 0; i < array.length; i++) {
			System.out.println("������һ��Ԫ��");
			array[i] = scanner.nextDouble();
		}
		for (int i = 0; i < array.length / 2; i++) {
			double temp = array[i];
			array[i] = array[i + (array.length + 1) / 2];
			array[i + (array.length + 1) / 2] = temp;
		}
	}
}
