package tk3;

/*
 * ѭ��ʵ�����еĴ����ͼƻ��Ĵ�����һ��
 */
public class Tk3 {
	public static void main(String[] args) {
		// ��� �����ֻ�����ֵ����400��ֹͣ�ۼ�
		double sum = 0;
		for (int i = 1; i < 50; i++) {
			sum += i;
			// System.out.println(i);
			if (sum >= 400) {
				break;// ������ǰѭ��
			} // ����ѭ��������
		}
		System.out.println(sum);
		// ֱ����ѭ�������м����ж�
		sum = 0;
		for (int i = 1; sum < 400; i++) {// ����ѭ��������
			sum += i;
		}
		System.out.println(sum);

	}
}
