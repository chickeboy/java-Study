package hk;

import java.util.Scanner;

/*
 * ����һ���ַ������飬����Ϊ4������4��ѧԱ������
 * �����������ϣ���������и����ϵ�ѧԱ��Ϣ
 */
public class Hk2 {
	public static void main(String[] args) {
		String[] array = new String[4];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("������һ������");
			array[i] = scanner.next();
		}
		System.out.println("������һ���ַ���");
		String name = scanner.next();
		for (int i = 0; i < array.length; i++) {
			if (array[i].contains(name)) {// ֻ�ܲ�ѯ����ƥ���ֵ
				System.out.println(array[i]);
			}
		}
	}
}
