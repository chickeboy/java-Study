package hk;

import java.util.Scanner;

/*
 * ����һ�����飬¼��5�����ݣ���������һ�����ݣ�
 * ��ѯ�������Ƿ���ڸ����ݣ�
 * ������ڴ�ӡ����Ӧ���±�λ�ã���������ڣ�
 * ��ӡ-1��Ĭ�������д�ŵ����ݲ��ظ���
 */
public class Hk1 {
	public static void main(String[] args) {
		int[] array = new int[5];
		Scanner scanner = new Scanner(System.in);
		// 1.ͨ��ѭ��¼������
		for (int i = 0; i < array.length; i++) {
			System.out.println("������");
			array[i] = scanner.nextInt();
		}
		// 2.�û�����һ����ѯ�ľ���ֵ
		System.out.println("������Ҫ��ѯ��ֵ");
		int num = scanner.nextInt();
		// 3.ͨ�����ֵȥ������ÿ��λ�ý���ƥ��
		// 4.����һ������index ��ʾԪ�س��ֵ��±�ֵ
		int index = -1;// ��Ϊ�±겻����ָ���,ֻҪ�����
		// ���index��һ���Ǹ�������ʾ�����������ֵ
		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) {
				index = i;// �����������ֵ�����ҵ���
				break;
			}
		}
		if (index != -1) {
			System.out.println(num + "�����ڵ�" + (index + 1) + "λ");
		} else {
			System.out.println(num + "������");
		}
	}
}
