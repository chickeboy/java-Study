package tk;

/*
 * 6.��1+4+7+����+100֮��
 */
public class Tk8 {
	public static void main(String[] args) {
		int sum = 0;// ��ͱ���
		for (int i = 1; i < 101; i += 3) {
			// int sum = 0;ѭ��������ı������ѭ�����������ʧ��
			sum = sum + i;
		}
		System.out.println("��Ϊ" + sum);
	}
}
