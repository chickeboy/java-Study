package hk;

import java.util.Scanner;

/*
 * ����һ�����飬����Ϊ10��Ҫ���û�¼һ�����ݺ�
 * ѯ���Ƿ�Ҫ���������������
 */
public class Hk10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] a = new double[10];
		for (int i = 0; i < a.length; i++) {
			System.out.println("������һ��Ԫ��");
			a[i] = scanner.nextDouble();
			if (i < 9) {
				System.out.println("�Ƿ�Ҫ����");
				String choice = scanner.next();
				if (choice.equals("����")) {
					break;// ����ѭ��
				}
			} else {
				System.out.println("��������");
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
