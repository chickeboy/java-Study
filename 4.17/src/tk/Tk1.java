package tk;

import java.util.Arrays;
import java.util.Scanner;

/*
 * �����ʵ��Ԫ�ظ���������ĳ��ȵ�����
 */
public class Tk1 {
	public static void main(String[] args) {
		int[] array = new int[5];
		// array.length �������������������ĳ���
		// ������¼������ݳ�����5��
		Scanner scanner = new Scanner(System.in);
		int size = 0;// �����д�ŵ�ʵ��Ԫ�ظ���
		while (true) {

			System.out.println("������һ����");
			array[size] = scanner.nextInt();
			size++;
			// �ȶ�size(0)��ֵ��Ȼ������+1
			if (size == array.length) {
				// ���������ʵ��Ԫ�ظ���==����ĳ���
				// ��ʾ�������ݴ�������Ҫ����
				// �������鱾���ǲ��ܸı䳤��
				array = Arrays.copyOf(array, size * 2 + 1);
			}
			System.out.println("�����Ƿ�Ҫ����");
			String choice = scanner.next();
			if (choice.equals("n")) {
				break;
			}
		}
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
	}
}
