package TK3;

public abstract class Play {
	public void start() {
		System.out.println("��ʼ��Ϸ");
	}
	abstract void play();
	public void end() {
		System.out.println("������Ϸ");
	}
	public void process() {
		start();
		play();
		end();
	}
}
