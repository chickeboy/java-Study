package tk;

/*
 * ����һ�����飬¼��5�����ݣ�������е����ֵ����Сֵ
 */
public class Tk4 {
	public static void main(String[] args) {
		int[] array = { -1, -2, -3, -5, -9 };
		//
		int max = array[0];
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = i;
			}
		}
	}
}
