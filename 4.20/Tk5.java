package tk;

import java.util.Scanner;

/*
 * ����һ������Ϊ4������
(1)��дһ���������ֶ�¼��4������
(2)����¼�뷽��������������һ��������ѯ�Ƿ���ڣ�������ڴ�ӡ�������ֵ��±�λ�ã������������-1
(3)���ò���

 */
public class Tk5 {
	public static void main(String[] args) {
		int[] array = new int[4];
		init(array);
	}

	public static void init(int[] array) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < array.length;) {
			System.out.println("������һ����");
			int num = scanner.nextInt();
			if (indexOf(array, num, i) == -1) {
				array[i] = num;
				i++;
			} else {
				System.out.println("���ظ�Ԫ��");
			}
		}
		for (int i : array) {
			System.out.println(i);
		}
	}

	// ͨ��ĳ��Ԫ�ػ�ȡ���Ԫ���������е��±�ֵ
	public static int indexOf(int[] array, int num, int size) {
		int index = -1;
		for (int i = 0; i < size; i++) {
			if (array[i] == num) {
				index = i;
				break;
			}
		}
		return index;
	}
}
