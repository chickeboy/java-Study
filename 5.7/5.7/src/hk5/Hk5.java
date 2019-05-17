package hk5;

import java.util.Scanner;

/*
 * �������еõ�5������������һ���������飬
 * Ȼ���ӡ�����Ҫ������������ݲ�Ϊ������
 * Ҫ����Integer.parseInt()�������쳣����ʾ����������������
 * ������������������5�����쳣������Խ�磩��
 * ��ʾ������������5��������
 */
public class Hk5 {
	public static void main(String[] args) {
		int[] array = new int[5];
		U u = new U();
		try {
			u.init(array);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}

class U {
	public void init(int[] array) {
		Scanner scanner = new Scanner(System.in);
		int size = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("������һ������");
			String str = scanner.next();
			try {
				int num = Integer.parseInt(str);
				array[size++] = num;
			} catch (NumberFormatException e) {
				System.out.println("����Ĳ�������");
			}
		}
		if (size != 5) {
			throw new IndexOutOfBoundsException("���鳤�Ȳ�Ϊ5");
		}
	}
}
