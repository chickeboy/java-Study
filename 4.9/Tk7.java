package tk;

import java.util.Scanner;

/*
 * ֪ʶ�㣺
 * if else if��Ƕ��ʹ��
 * �Լ��������ж�����ʹ��
 */
public class Tk7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ����");
		int num = scanner.nextInt();
		// �ж�һ����������������������0 ���ʱ����3��ѡ��
		if (num > 0) {
			System.out.println(">0");
		}
		if (num == 0) {
			System.out.println("=0");
		}
		if (num < 0) {
			System.out.println("<0");
		}
		if (num > 0) {
			System.out.println(">0");
		} else {
			// С�ں͵��ڵ������������
			if (num < 0) {
				System.out.println("<0");
			} else {
				System.out.println("=0");
			}
		}
		int a = 0;// ����������
		// System.out.println(a);// ���������ʱ��û�и�ֵ���޷�ֱ��ʹ��
		// final���α�������ʾ������������ٴθ�ֵ
		int c = 3;
		int d = 4;
		if (c < d) {
			a = 10;
		} else {
			if (c > d) {
				a = 11;
			} else {
				a = 12;
			}
		}
		System.out.println(a);
	}
}
