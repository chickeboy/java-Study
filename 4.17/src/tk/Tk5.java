package tk;

import java.util.Scanner;

/*
 * ͨ���±��ȡֵ
 * ͨ��ֵ��ȡ�±� 
 */
public class Tk5 {
	public static void main(String[] args) {
		int[] array = { 2, 4, 5, 6, 21 };// û���ظ����ݵ�����
		System.out.println("��������Ҫ���ҵ���");
		// �ж�������Ƿ���������
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();// �û�Ҫ�����
		// �����������������ÿ��λ���Ͻ���ƥ��
		// ���Ա��� ��0��β
		int index = -1;// �±��ǲ������-1��
		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) {
				index = i;// ���±긳ֵ��index
				break;// ��Ϊû���ظ��ģ�����һ���ҵ���ֱ���˳�
			}
		}
		if (index == -1) {// ��ʾѭ�������if����û���жϳɹ�
			System.out.println(num + "������");
		} else {
			System.out.println(num + "������ " + index + "�±�λ");
		}

	}
}
