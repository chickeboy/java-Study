package tk;

/*
  * JAVA���жϴ�����������
  * Error:�����޷������һ������Ӳ����ɵ�����
  * Exception:�쳣,����ͨ�������߼�ȥ�޸���
  * ������������ǰ�Ͽε�ʱ�����ıʼǣ���ע������ܳ�������
  * �쳣�Ĳ���һ�����ڵ�ʱ�޷����������⣬������
  * ������Ҫ����ȥ�����Ի�ȥ��ĳ��λ���Ȳ����쳣���ó���
  * �����Ĺ��ܲ���Ӱ��
  * ��������Ҫͨ������ȥ����������
  * ��ʵ�쳣���б���ľ�������ɫɫ�Ĵ�����ֱ���Ĵ�����Ϣ��������Ϣ��
 */
public class Tk1 {
	public static void main(String[] args) {
		// ���Ǳ��벶���쳣
		// һ�㽫���ܳ����쳣�Ĵ�����뵽try�������
		// ���е�ʱ����ܻ�������ֽ��
		// 1.�������� ����catch 2.���������Ļ��ߵ�catch�������
		try {
			System.out.println(1 / 0);// ֱ�Ӿ�ȥcatch��
			// try�е����´����޷�ִ��
			System.out.println("ff");
		} catch (ArithmeticException e) {
			// ���ڴ���淶������ԱӦ��������ָ�����ܳ��ֵľ����쳣
			// Exception e = new ArithmeticException();
			// System.out.println("�ұ�ը��");
			System.out.println("��0��");
			System.out.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("over");
	}
}
