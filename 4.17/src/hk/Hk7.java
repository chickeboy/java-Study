package hk;

import java.util.Scanner;

/*
 * 7.�Ӽ�������5��������һά�����У�
 * �������Ԫ�صĺͣ�����ȡƽ��ֵ���������
 */
public class Hk7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] a = new double[5];
		for (int i = 0; i < a.length; i++) {
			System.out.println("������һ��Ԫ��");
			a[i] = scanner.nextDouble();
		}
		double sum = 0;
		// ��;��ǵ�����ÿ��λ���Ϸ������ݣ�Ȼ���ۼ�
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		double avg = sum / a.length;
		System.out.println(avg);
	}
}
