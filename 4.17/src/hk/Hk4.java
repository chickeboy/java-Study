package hk;

import java.util.Arrays;
import java.util.Scanner;

/*
 * �Ӽ�������5��������һά����a�У�
 * �ٽ����е�ֵ���෴��˳���������b�в����
 */
public class Hk4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] a = new double[5];
		for (int i = 0; i < a.length; i++) {
			System.out.println("������һ��Ԫ��");
			a[i] = scanner.nextDouble();
		}
		double[] b = new double[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[a.length - i - 1];
		}
		// ͨ���±��ȡ��ȡ��������
		// b = Arrays.copyOfRange(a, a.length - 1, 0);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
