package tk1;

/*
 * ���߳�
 * ����:һ������ִ�еĹ���,��Դ���ƱȽϰ�ȫ����˵���
 * �߳�:�����µĸ�С��Դ��λ,��Դ����Ƚ��鷳�����ǿ���
 * ������Դ��ʹ��Ч��
 * ����:һ���˳�������ͷ��һ�������ٴ�һ��
 * ����:�����˳�һ����ͷ���������˭����ͷ��Ŀ�˭���õ���Դ
 * �첽:���һ������˭��������˭��
 * �������һ����ҳ��10��ͼƬ
 * ͬ��1 2 3 4 5 6
 * �첽:һ����أ�ÿ��ͼƬֻ������һ��
 * Eclipse����һ������
 * ����Ҫ�Խ����µ������Դ���з���
 * main�����Ѿ�����һ���߳� ���߳� ���ǿ�������
 * �߳��¼��������߳�
 * Thread �̳߳���
 * ����Լ������߳�
 * 
 * 
 */
public class Tk1 {
	public static void main(String[] args) {
//		System.out.println(Thread.currentThread().getId());
//		System.out.println(Thread.currentThread().getName());
		// ���������߳�
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "......mianx" + i);
		}
		MyThread myThread = new MyThread("A");// ׼��״̬�����̶߳���
		myThread.start();// �����߳�
		MyThread myThread2 = new MyThread("B");
		myThread2.start();// start�ڲ�����run����
		// �����߳�һ��Ҫ��дrun����
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "......mainy" + i);
		}
	}
}

//1.��дһ���̳���Thread����ȥ�����߳�
//ʹ��ʵ�ֽӿ� Runnable �Ķ��󴴽�һ���߳�ʱ��
//�������߳̽������ڶ���ִ�е��߳��е��ö���� run ����
//�����߳̾�Ҫ����run������run������Ҫ��д������ŵľ����������߳�
//����Ҫִ���߼�
class MyThread extends Thread {
	//
	public MyThread(String name) {// name��Thread�ĳ�Ա����
		// TODO Auto-generated constructor stub
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(getName() + "....." + i);
		}
	}
}
