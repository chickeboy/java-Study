package tk;

import java.util.Scanner;

/*
 * ����ѭ�����߼�ѵ��
 * ˫��ѭ�� ��ѭ���������� ��ʵ���������εĸ�
 * ��ѭ��������һ���ж�������
 * �����ÿ����ѭ���Ĵ����������ı�
 * ÿ����ѭ��������i�ǻ���
 * ��ѭ����j��ȡֵ��ΧҪ��i������ϵ
 */
public class Tk15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����������εĸ�");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
				// ���ܻ��У�Ҫ����ѭ��ִ����ϣ�Ҳ����һ�����ݴ�ӡ��ϲ��ܻ���
			}
			System.out.println();
		}
		System.out.println("===================");
		for (int i = 0; i < n; i++) {
			// �ȴ�ո��ٴ�*
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
				// ���ܻ��У�Ҫ����ѭ��ִ����ϣ�Ҳ����һ�����ݴ�ӡ��ϲ��ܻ���
			}
			System.out.println();
		}
		System.out.println("===================");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
