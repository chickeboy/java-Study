package hk4;

public class SickException extends Exception {
	
	public String cure(Worker worker){
		int alive = worker.getAlive();
		alive  = (int) Math.floor(Math.random() + 0.9);
		if (alive == 0) {
			return "sorry¾¡Á¦ÁË";
		} else {
			return "¹§Ï²Äã";
		}
	}
}