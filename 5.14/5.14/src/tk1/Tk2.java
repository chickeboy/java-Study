package tk1;

/*
 * �ڶ��������̵߳ķ�ʽ
 * ʵ��һ����Runnable�Ľӿ�
 * 
 *ʹ�ÿ����̵߳����ַ�ʽ
 *1���̴߳�ӡ��ĸa-z ÿ��1��
 *1���̴߳�ӡ����1-26 ÿ��2��
 *1���̴߳�ӡ�����Ͽ׾�˧ ��ѭ�� ÿ��0.2��
 * 
 */
public class Tk2 {
	public static void main(String[] args) {
		MyRun myRun = new MyRun();
		Thread thread = new Thread(myRun, "A");
		thread.start();
		Thread thread2 = new Thread(myRun, "B");
		thread2.start();
		// �����ڲ��࿪���߳�
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println(Thread.currentThread().getName() + "...." + i);
					// ����ֻ��ͨ��Thread.currentThread().getName()��ȡ��ǰ�߳���
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}, "C").start();
	}
}

class MyRun implements Runnable {
//��Ϊû���˸���Thread��������û��name����߳����Ƶ�����
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "...." + i);
			// ����ֻ��ͨ��Thread.currentThread().getName()��ȡ��ǰ�߳���
			// �̵߳�����
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // ˯��1�룬�Զ�����
		}
	}

}
