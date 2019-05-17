package HK2;

public class Vehicle {
	int speed;
	int size;
	public void move() {
		System.out.println("ËÙ¶È"+speed);
		
	}
	public void setSpeed(String str){
		if(str.equals("+")) {
			speed = speedUp(speed); 
		}else if(str.equals("-")) {
			speed = speedDown(speed); 
		}
		move();
	}
	public int speedUp(int speed) {
		speed+=5;
		return speed;
	}
	public int speedDown(int speed) {
		speed-=5;
		return speed;
	}
}
