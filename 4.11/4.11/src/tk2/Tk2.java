package tk2;

/*
 * ��1-1/3+1/5-1/7+1/9...-1/99+1/101֮�͡�
 */
public class Tk2 {
	public static void main(String[] args) {
		// 1.�ֳ������ֲ���
		// 1.�����������ĺ� �����и����ĺͣ�Ȼ�����
		double sum1 = 0;
		for (int i = 1; i < 102; i += 4) {
			sum1 += 1.0 / i;// ��ֹ������ʧ
		}
		double sum2 = 0;
		for (int i = 3; i < 100; i += 4) {
			sum2 += 1.0 / i;// ��ֹ������ʧ
		}
		System.out.println(sum1 - sum2);
		// ��һ��ѭ������
		double sum = 0;
		// int a = 1;
		for (int i = 1; i < 102; i += 2) {
			// ÿ��ѭ����������Ҫ�ı�
			sum = sum + 1.0 / i * Math.pow(-1, i / 2);
		}
	}
}
