package hk4;

import java.util.Random;

/*
 * ��һ����������һ��������alive�����������������������
 * �͹�������(work����)���ڹ���;�п��ܻ�����
 * ���׳��Զ����쳣��SickException������
 * Ҳ�����ǽ�����û����.(ͨ��������������������)��
 * ��һ��ҽ����⹤���߹�����һ�����������������
 * �͵���cure(Worker worker)�����������β���
 * ��ͨ������������ƣ���������Ҳ����������������alive��ֵ����
 * �����ж�alive����ֵҪ��������ʵ����ϲ�㡱��
 * Ҫ��������ʾ��sorry�����ˡ���
 */
public class Hk4 {
	public static void main(String[] args) {
		Worker worker = new Worker();
		Doctor doctor = new Doctor();
		doctor.check(worker);
	}
}

class Doctor {
	public void check(Worker worker) {
		try {
			worker.work();
			System.out.println("��ϲ���彡��");
		} catch (SickException e) {
			System.out.println(e.getMessage());
			cure(worker);
		}
	}

	public void cure(Worker worker) {
		worker.setAlive(new Random().nextInt(2));
		if (worker.getAlive() == 1) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
	}
}

class Worker {
	private int alive;

	public void work() {
		Random random = new Random();
		int sick = random.nextInt(2);// 0��û������ 1��������
		if (sick == 1) {
			throw new SickException("������");
		}
	}

	public int getAlive() {
		return alive;
	}

	public void setAlive(int alive) {
		this.alive = alive;
	}

}

class SickException extends RuntimeException {
	public SickException(String msg) {
		super(msg);
	}
}
