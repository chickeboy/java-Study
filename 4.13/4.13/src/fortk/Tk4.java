package fortk;

/*
 * ������������a��b����֪a*b=2048��
 * ��a��b��Ϊ��ֵʱ��a+b��ֵ��С
 */
public class Tk4 {
	public static void main(String[] args) {
		int min = 2049;// ��ʼֵ
		int minA = 0;
		int minB = 0;
		for (int a = 1; a < 2049; a++) {
			for (int b = 0; b < 2049; b++) {
				if (a + b < min && a * b == 2048) {
					min = a + b;
					minA = a;
					minB = b;
				}
			}
		}
		System.out.println(minA + "," + minB);
	}
}
