package tk;

import java.util.Scanner;

/*
 * ��������г������ظ�Ԫ�أ���Ҫ��ȡ�±���ô��
 */
public class Tk6 {
	public static void main(String[] args) {
		String[] array = { "����", "����", "����", "����" };
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ҫ���ҵ�ѧ������");
		String name = scanner.next();
		int[] nameArray = new int[array.length];
		for (int i = 0; i < nameArray.length; i++) {
			nameArray[i] = -1;// ����ֵ-1Ϊ�˺��±�0����
		}
		// �������е��˶�������,����ԭ�����г��ֵ�λ��
		boolean flag = false;
		for (int i = 0; i < array.length; i++) {
			if (name.equals(array[i])) {
				nameArray[i] = i;
				flag = true;
				// ��������±�λ���ϵ�Ԫ�غ��±�ֵһ��
				// �����л�����е�λ��û�б���ֵ
			}
		}
		if (flag) {
			for (int i : nameArray) {
				if (i != -1) {
					System.out.println(i);
				}
			}
		} else {
			System.out.println("û���ҵ�");
		}
	}
}
