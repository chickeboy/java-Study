package tk;

/*
 * ��ά���飺java������û�ж�ά��������
 * ��ʵ��ά�������һ��һά���������˶��һά����
 */
public class Tk2 {
	public static void main(String[] args) {
		// int[] a = {1,2};
		int[][] array = { { 1, 2 }, { 2, 3, 4 }, { 4, 5 } };
		// ����ĳһ��ֵ
		System.out.println(array[2][1]);
		System.out.println(array[1][1]);
		System.out.println(array[0][0]);
		// ��ά����ı���
		for (int i = 0; i < array.length; i++) {
			// ���ʸ�ά��Ҳ����¥����
			System.out.print("{");
			for (int j = 0; j < array[i].length; j++) {
				// array[i].length��ʾÿ��¥�м�������
				System.out.print(array[i][j] + ",");
			}
			System.out.println("}");
		}
		// ��ά����Ķ�̬¼��
		// �Ĳ�¥��ÿ��¥5������ һ��20������
		int[][] a1 = new int[4][5];
		int[][] a2 = new int[4][];// ��¥������û�з�����
		// ��ά������Դ�����ʱ��ʡ�Ե�γ�ģ�����
		// ����һ��Ҫ�ֶ���ֵ��Ҳ���ǿ����ڴ�ռ�
		a2[0] = new int[4];
		a2[1] = new int[2];
		a2[2] = new int[1];
		a2[3] = new int[5];

	}
}
