package hk;

//1.����뾶��1��ʼ��10��Χ�����С�ڵ���10��Բ���
public class Hk1 {
	public static void main(String[] args) {
		double s = 0;
		for (double r = 1.0;; r++) {
			s = Math.PI * r * r;
			if (s <= 10) {
				System.out.println(s);
			}
		}
	}
}
