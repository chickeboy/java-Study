package hk;

/*
 * ��1!+2!+3!+...+20!֮��
 */
public class Hk2 {
	public static void main(String[] args) {
		double sum = 0;
		double num = 1;// ��¼ÿ��i�Ľ׳�
		for (int i = 1; i < 21; i++) {
			num *= i;// num������ÿ��ѭ����¼�Ľ׳�ֵ
			sum += num;
		}
		System.out.println(sum);
	}
}
