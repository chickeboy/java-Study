package HomeWork4;
/*��5����Ҫ��ɽ��,��ȷ��ɽ��ͬʱֻ����һ����ͨ������ɽ����Ҫ2�룩��
��ӡ�����ͨ����˳��
����ɽ����˳���ǲ��ɿصģ�ֻҪ��֤ͬһʱ��ֻ��һ������ͨ��ɽ�����ɣ�
��ʾ��ʹ���߳�ͬ��*/
public class hk4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread myThread = new MyThread();
		new Thread(myThread,"��һ�л�").start();
		new Thread(myThread,"�ڶ��л�").start();
		new Thread(myThread,"�����л�").start();
		new Thread(myThread,"�����л�").start();
		new Thread(myThread,"�����л�").start();
	}
}
class MyThread implements Runnable{
	Object object = new Object();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (object) {
			System.out.println(Thread.currentThread().getName()+"����ͨ��ɽ��");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
