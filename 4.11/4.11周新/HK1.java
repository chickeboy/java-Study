package hk;

//1.����뾶��1��ʼ��10��Χ�����С�ڵ���10��Բ���
public class HK1 {
	public static void main(String[] agrs) {
		double sun = 0;
		for (int i = 1; i < 11; i++) {
			sun = Math.PI * Math.pow(i, 2);
			if (sun <= 10) {
				System.out.println("С�ڵ���10��Բ���Ϊ" + sun);
			} else {
				break;//ѭ�h����11��Ȼ���˳�
			}
		}

	}
}