package hk3;

/*
 * ��һ�����б�дһ��������
 * �����������һ���ַ��������Ƿ����ĳ���ַ���������ڣ�
 * �򷵻�����ַ����ַ������е�һ�γ��ֵ�λ�ã��±꣩��
 * ���򣬷���-1��Ҫ�������ַ�������ַ����Բ�����ʽ���ݸ��÷�����
 * ������������Ϊnull�����׳�IllegalArgumentException�쳣��
�����main�������Ը��ֿ��ܳ��ֵ�
���������֤�÷�����д���Ƿ���ȷ��
���磺�ַ������ڣ��ַ����ڣ�
���������Ϊnull��,�����������Ҫ��ӡ���ټ�2����
 */
public class Hk3 {
	public static void main(String[] args) {
		Ut ut = new Ut();
		char[] ct = null;
		char c = 'x';
		try {
			int index = ut.indexOf(ct, c);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("�ټ�");
		}
	}
}

class Ut {
	public int indexOf(char[] ct, char c) {
		if (ct == null) {
			throw new IllegalArgumentException("����Ϊ��");
		}
		int index = -1;
		for (int i = 0; i < ct.length; i++) {
			if (c == ct[i]) {
				index = i;
				break;
			}
		}
		return index;
	}
}
