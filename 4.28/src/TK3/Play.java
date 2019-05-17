package TK3;

public abstract class Play {
	public void start() {
		System.out.println("开始游戏");
	}
	abstract void play();
	public void end() {
		System.out.println("结束游戏");
	}
	public void process() {
		start();
		play();
		end();
	}
}
