package hk;

/*
 * ��1!+5!+9!+...+21!֮��
 */
public class Hk3 {
	public static void main(String[] args) {
		double sum = 0;
		double num = 1;
		for (int i = 1; i < 22; i++) {
			// ÿ�����Ľ׳˻���Ҫ���㣬ֻ��ѡ���Ե��ۼ�
			num *= i;
			if (i % 4 == 1) {
				sum += num;
			}
		}
		System.out.println(sum);
	}
}
