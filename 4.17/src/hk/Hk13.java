package hk;

import java.util.Arrays;
import java.util.Scanner;

/*
 * ����һ���������5�����ݣ�
 * Ȼ��ͨ�����ַ�ʽ��ɶ�����ĸ��ƺ����
 */
public class Hk13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] a = new double[5];
		for (int i = 0; i < a.length; i++) {
			System.out.println("������һ��Ԫ��");
			a[i] = scanner.nextDouble();
		}
		double[] b = new double[a.length];
		// 1.�ֶ���ֵ
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}
		// ����Arrays.copy
		double[] c = Arrays.copyOf(a, a.length);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		// �ڶ��ֱ�����ʽ for eachѭ��
		// ��ǿforѭ��
		// for(�����д�ŵ��������ͱ���:����Դ)
		for (double d : c) {
			System.out.println(d);// ������ÿ��λ�õ�ֵ
			// һ���������
		}
	}
}
