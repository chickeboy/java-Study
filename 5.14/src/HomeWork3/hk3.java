package HomeWork3;
/*���ӷ��ң�3ֻ�������ŷ�100ֻ���ӣ�
ÿֻ�����ĺ��ӷ�ȥʣ�����ӵ�һ�룬
����Ϊֹ��ʹ�ö��߳�ģ����һ����*/
public class hk3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pach pach = new Pach();
		new Thread(pach,"��һֻ����").start();
		new Thread(pach,"�ڶ�ֻ����").start();
		new Thread(pach,"����ֻ����").start();

	}

}
