package hk;

import java.util.Scanner;

/*
 * 9.����һ�����飬����Ϊ5��
 * ����ֻ�ܴ�ŷǸ���������Ǹ���������ʾ�޷�¼�룬
 * Ҫ���û�һ��Ҫ¼��5�����ݣ���֤�����д���5���Ϸ����ݣ�
 */
public class Hk9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] a = new double[5];
		for (int i = 0; i < a.length;) {
			System.out.println("������һ��Ԫ��");
			double num = scanner.nextDouble();
			if (num < 0) {// ���Ϸ���
				// ���Ϸ��Ļ��±겻���ƶ�
				System.out.println("��������");
			} else {// �Ϸ���
				a[i++] = num;
				// ����Ҫ������I��λ��ֵ���±겢���ƶ�
//				a[i] = num;	
//				i++;
			}
		}

	}
}
