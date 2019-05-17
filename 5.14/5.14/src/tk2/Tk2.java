package tk2;

/*
 * �� Runnable�ӿ�ʵ�ֵķ�ʽȥ��Ʊ
 */
public class Tk2 {
	public static void main(String[] args) {
		TicketRun run = new TicketRun();
		// runֻ��һ��Ҳ����ticket����ԴҲֻ��1��
		// �����̲߳���ͬһ������Դ
		new Thread(run, "1�Ŵ���").start();
		new Thread(run, "3�Ŵ���").start();
		new Thread(run, "2�Ŵ���").start();

	}
}

//synchronized �̵߳�ͬ���� ��֤һ����Դͨ����ͬһʱ��ֻ��
//��һ���߳��ڲ�����������˯�ߣ�ҲҪ������ɺ��ó�ͨ���������˲��ܽ���
//������(д�ڷ��������ϣ�������������������)   ������(���Զ�ĳ���ֲ�������������)
class TicketRun implements Runnable {
	private int ticket = 100;
	private Object obj = new Object();

	// ���ﲻ�ʺ��÷��������ᵼ������ѭ��ִ�����Ժ�
	// ��һ��������Դ���̲߳Ż��ó���Դͨ��
	// ������
	@Override
	public void run() {

		while (true) {
			synchronized (obj) {
				if (ticket == 0) {
					break;
				}
				// �̷߳��������������߳̿��Գ������
				System.out.println(Thread.currentThread().getName() + ".......���ڳ���" + ticket--);
			}
			// ����������Ȼ���ҳ���һ����Ϣ������Ʊһ���
			// �����˯��Ҳ���������棬һ���˳���Ʊ��˯�ߺ󣬲Ż��������˽��룬�����������
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
