package tk3;

/*
 * ���1-1000�����м����Ա�3Ҳ���Ա�5���������ĺ�
 */
public class Tk5 {
	public static void main(String[] args) {
		double sum = 0;
		for (int i = 1; i < 1001; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
