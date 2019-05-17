package hk4;

import java.util.Random;

/*
 * 有一个工作者有一个属性是alive（保存的是治愈还是死亡）
 * 和工作方法(work方法)，在工作途中可能会生病
 * （抛出自定义异常（SickException）），
 * 也可能是健康的没生病.(通过随机数来控制生病与否)。
 * 有一个医生监测工作者工作，一旦出现生病的情况，
 * 就调用cure(Worker worker)方法来给其治病，
 * （通过随机数来控制，可能治愈也可能死亡（给属性alive赋值））
 * 最终判断alive属性值要是治愈现实“恭喜你”，
 * 要是死亡显示”sorry尽力了“。
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
			System.out.println("恭喜身体健康");
		} catch (SickException e) {
			System.out.println(e.getMessage());
			cure(worker);
		}
	}

	public void cure(Worker worker) {
		worker.setAlive(new Random().nextInt(2));
		if (worker.getAlive() == 1) {
			System.out.println("死了");
		} else {
			System.out.println("活者");
		}
	}
}

class Worker {
	private int alive;

	public void work() {
		Random random = new Random();
		int sick = random.nextInt(2);// 0是没有生病 1就是生病
		if (sick == 1) {
			throw new SickException("生病了");
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
