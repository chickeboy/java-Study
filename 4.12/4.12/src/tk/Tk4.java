package tk;

/*
 * ��֪����1/2,2/3,3/5,5/8,...,����ǰ20��֮��
 * 1	2	3	5		a
 * 2	3	5	8		b
 * ��һ��ѭ���ķ��Ӿ�����һ��ѭ���ķ�ĸ
 * ��һ�εķ�ĸ������һ�εķ��Ӻͷ�ĸ�ĺ�
 * c ���� a + b��ֵ�Ϳ�����
 * a = b
 * b = c
 */
public class Tk4 {
	public static void main(String[] args) {
		double a = 1;
		double b = 2;
		double c = 0;
		double sum = 0;
		for (int i = 0; i < 20; i++) {
			sum = sum + a / b;
			c = a + b;
			a = b;
			b = c;
		}
		System.out.println(sum);
	}
}
