package hk;

import java.util.Scanner;

/*
 * ����һ���ַ������飬����Ϊ4������4��ѧԱ������
 * �����������ϣ��ֱ���������ϵ�һ�γ��ֵ��±�λ�ã�
 * �����һ�γ��ֵ��±�λ�ã���������ڣ����ӡ������
 */
public class Hk3 {
	public static void main(String[] args) {
		String[] array = new String[4];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("������һ������");
			array[i] = scanner.next();
		}
		System.out.println("������һ���ַ���");
		String name = scanner.next();
		int[] a = new int[array.length];
		int size = 0;// ���ȴ���������ʵ�ʴ�ŵ�Ԫ�ظ���
		// Ҳ������Ϊ�����Զ�����±�ʹ�ã���������
		// ��ʵ���ǵ�����һ��������ʱ���±�Ż��ƶ�
		for (int i = 0; i < array.length; i++) {// ���i�ǿ���ԭ��������±�
			if (array[i].contains(name)) {
				a[size] = i;// ��ȡֵ��Ϊ�±�
				size++;// ��ӳɹ�һ���±��ƶ�һ��
			}
		}
		// ����ֻ��һ��
		if (size == 0) {
			System.out.println("û������˵���Ϣ");
		} else if (size == 1) {
			System.out.println(name + "����Ϣֻ��һ��" + a[0]);
		} else {
			System.out.println(name + "��һ�γ�����" + (a[0]) + "���һ�γ�����" + a[size - 1]);
		}
	}
}
