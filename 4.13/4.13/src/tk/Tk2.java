package tk;

import java.util.Scanner;

/*
 * ����ĸ�ֵ�ͱ������
 */
public class Tk2 {
	public static void main(String[] args) {
		// int[] array = { 2, 4, 5 };
//		System.out.println(array[0]);
//		System.out.println(array[1]);
//		System.out.println(array[2]);

		// ������[�±�] ֱ�ӿ��Է��ʵ����λ���ϵ�ֵ
		// System.out.println(array[4]);���ܷ���û�е�λ��
		// �﷨ͨ����
		int[] array = new int[5];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("������һ����");
			int num = scanner.nextInt();
			// �������ÿһ��λ�ý��и�ֵ
			array[i] = num;// array[i]����ߴ�����������ڴ�λ��
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);// �������i��λ�ϴ�ŵĳ���ֵ
		}
		int a = 3;
		System.out.println(a);
		System.out.println(array[0]);// ��ӡ����������
		// ������������������ new�Ķ������ڶ��ڴ���
	}
}
