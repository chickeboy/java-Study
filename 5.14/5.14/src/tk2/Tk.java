package tk2;

/*
 * ���ֿ����̷߳�ʽ������
 * 100��Ʊ ������������
 */
public class Tk {
	public static void main(String[] args) {
		new TicketThread("1�Ŵ���").start();
		new TicketThread("3�Ŵ���").start();
		new TicketThread("2�Ŵ���").start();

	}
}

class TicketThread extends Thread {
	private int ticket = 100;

	// ��ʵ����ֻ��100��Ʊ��������Ϊticketд�����ǵ�
	// ���������ÿ��һ���̶߳��ᴴ��һ���µ�ticket ��������300��Ʊ
	public TicketThread(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}

	@Override
	public void run() {
		while (ticket > 0) {
			System.out.println(getName() + ".......���ڳ���" + ticket--);
		}
	}
}
