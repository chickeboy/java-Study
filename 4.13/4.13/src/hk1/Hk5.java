package hk1;

/*
 * 5.ʹ��do-whileʵ�֣���������¶��뻪���¶ȵĶ��ձ�
 * Ҫ�����������¶�0�ȵ�250�ȣ�ÿ��20��Ϊһ�
 * ���ձ��е���Ŀ������10����
     ת����ϵ�������¶� = �����¶� * 9 / 5.0 + 32
 */
public class Hk5 {
	public static void main(String[] args) {
		double h = 0;
		double s = 0;
		int count = 0;// ��¼ʵ�ʴ��˶�����
		System.out.println("���϶�\t\t���϶�");
		do {
			h = s * 9 / 5 + 32;// ��������϶�
			System.out.println(s + "\t\t" + h);
			count++;
			if (count == 10) {
				break;
			}
			s += 20;
		} while (s <= 250);
	}
}
