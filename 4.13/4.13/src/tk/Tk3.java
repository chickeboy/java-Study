package tk;

public class Tk3 {
	public static void main(String[] args) {
		// ����֮����θ�ֵ
		int[] array1 = new int[] { 1, 2, 3 };
		int[] array2 = new int[] { 2, 4, 1 };
		System.out.println(array1);
		System.out.println(array2);
		int a = 3;
		int b = 4;
		a = b;
		array1 = array2;
		System.out.println(array1);
		System.out.println(array2);
		array1[1] = 100000;
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		System.out.println("===============");
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);

		}
		// ������ñ���ָ��ͬһ���ڴ��Ҷ������
		// �ڴ�Ĳ���Ȩ�ޣ�һ�������������ڴ�
		// ���������ٴη��ʵ�ʱ���ڴ��е�ֵҲ�����仯

	}
}
