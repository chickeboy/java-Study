package tk;

/*
 *RuntimeException Exception��һ������
 *  ����ʱ�쳣�����ܲ��쳣:����Ա���㲻�ֶ��׳�
 *  ����ִ�е����������ʱ����������쳣
 * JVM�����Ҳ������׳��쳣
 * ֱ�Ӽ̳���RuntimeException�����඼�Ƿ��ܲ��쳣
 * Exception
 * ֱ�Ӽ̳���Exception����RuntimeException�������쳣
 * �����ܲ��쳣���ڱ�д�����ʱ���ǿ��Ҫ���׳����߲�����쳣
 * �������﷨��ͨ���������쳣
 */
public class Tk6 {
	/*
	 * �������Լ�д�����ʱ�������ʼ� ���������������쳣���JDK��û����ô��
	 */
	public static void main(String[] args) {
		new Ut().a(-10);
	}
}

class Ut {
	public void a(int x) {
		if (x < 3) {
			try {
				throw new MyException("����С��3", x);
			} catch (MyException e) {
				System.out.println(e);
			}
		}
	}
}

//1.�̳�Exception ֱ�ӳ�Ϊ�������࣬������ܲ��쳣
//1.����Ա��׳�  throw
//2.�Զ����쳣�������Լ��ĳ�Ա����
class MyException extends Exception {
	private int num;// ��ʾ���ǳ��������

	public MyException(String name, int num) {
		super(name);
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {	
		this.num = num;
	}

	@Override
	public String toString() {
		return "���������С��3����������������.." + num;
	}

}
