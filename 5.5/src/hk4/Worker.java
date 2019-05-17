package hk4;

public class Worker {
	private int alive;

	public Worker() {
		super();
	}

	public Worker(int alive) {
		super();
		this.alive = alive;
	}

	public int getAlive() {
		return alive;
	}

	public void setAlive(int alive) {
		this.alive = alive;
	}

	public void woker() throws SickException {
		while (true) {
			int a = (int) Math.floor(Math.random() + 0.9);
			if (a == 0) {
				System.out.println("Éú²¡ÁË");
				throw new SickException();
			}
		}
	}
}
