package tk;

/*
 * ѡ������
 * ÿ����ѭ���������С�����ƶ�������ѭ���ĵ�һλ�±�
 * ��ѭ���Ȱѵ�һλ����ȥ�ͺ������е�����С
 * ���������һ�����������ҪС�������Ž�������¼��������±�
 * ���Ǿ���Ҫ����һ������min�����¼��С�����±�
 * ������һ�֣��Ž���ֵ������С�����ŵ���һλ
 */
public class Tk3 {
	public static void main(String[] args) {
		int[] array = { 5, 3, 1, 2, 7 };
		for (int i = 0; i < array.length - 1; i++) {
			int min = i;// �����iλ����С�����±�
			for (int j = i + 1; j < array.length; j++) {
				if (array[min] > array[j]) {
					min = j;// ��¼����С�����±�
				}
			} // ��ѭ��������
			if (min != i) {// ��ֹ��һλ��������С��
				int temp = array[i];
				array[i] = array[min];
				array[min] = temp;
			}
		}
		for (int i : array) {
			System.out.println(i);
		}
	}
}
