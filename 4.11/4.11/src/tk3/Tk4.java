package tk3;

/*
 * 
 *  ��1+1/3+1/5+...��ǰ20��֮��
 */
public class Tk4 {
	public static void main(String[] args) {
		double sum = 0;
		// ������ �����ѭ��δ֪������ʱ��
		// ��Ҫ�Լ�ȥ����һ��������ȥ��¼ѭ��ʵ��
		// ִ�еĴ���
		int count = 0;
		for (int i = 1; count < 20; i += 2) {
			sum += 1.0 / i;
			count++;
//			if (count == 20) {
//				break;
//			}
		}
		System.out.println(sum);
		sum = 0;
		int i = 1;
		for (int j = 0; j < 20; j++) {
			sum = sum + 1.0 / i;
			i += 2;
		}
		System.out.println(sum);
	}
}
