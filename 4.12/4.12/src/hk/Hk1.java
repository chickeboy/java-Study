package hk;

/*
 * ����뾶��1��ʼ��10��Χ�����С�ڵ���10��Բ���
 */
public class Hk1 {
	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			double sum = Math.PI * Math.pow(i, 2);
//			if (sum <= 10) {
//				System.out.println(sum);
//			} else {
//				break;
//			}
			if (sum > 10) {
				break;
			}
			System.out.println(sum);
		}
	}
}
