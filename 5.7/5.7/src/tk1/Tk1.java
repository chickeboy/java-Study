package tk1;

/*
 * ��װ��
 * �������������ͳ���ֵ��װ�������������͵Ķ�����
 * �ṩ����ķ���
 * ���䣬װ��
 */
public class Tk1 {
	public static void main(String[] args) {
		int a = 3;
		// �ֶ�װ��
		Integer it = new Integer(a);// ��a���ĳ���ֵ���Ƶ���it��
		// �Զ�װ��
		Integer i = a;// new Integer(a);
		int b = it.intValue();// ���������������д�ŵĳ���ֵͨ��intValue�������з���
		b = it;// �Զ�����
		System.out.println(it);
		Byte bt = 3;
		Short st = 3;
		Long l = 3L;
		Float f = 3.4f;
		Double d = 3.3;
		Boolean bb = false;
		Integer ig = 3;
		Character cact = 'f';
	}
}
