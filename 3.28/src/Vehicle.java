import java.util.Scanner;
/*2.请定义一个交通工具(Vehicle)的类，其中有:
属性：速度(speed)，体积(size)等等
方法：移动(move())，设置速度(setSpeed(int speed))，加速speedUp(),减速speedDown()等等.
最后在测试类Vehicle中的main()中实例化一个交通工具对象，并通过方法给它初始化speed,size的值，
并且通过打印出来。另外，调用加速，减速的方法对速度进行改变。（类的成员变量）
*/
public class Vehicle {
	int sped;
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int speed = scanner.nextInt();
		vehicle.move(speed);
		vehicle.setSpeed(speed);
	}
	public void setSpeed(int speed) {
		Vehicle vehicle = new Vehicle();
		Scanner scanner = new Scanner(System.in);
		int sped =speed;
		while (true) {
			System.out.println("输入1加速输入2减速");
			int a = scanner.nextInt();
			if (a == 1) {
				vehicle.speedUp(sped);
				sped = vehicle.sped;
			} else if (a == 2) {
				vehicle.speedDown(sped);
				sped = vehicle.sped;
			} else {
				break;
			}
			vehicle.move(sped);
		}
	}
	public void move(int speed) {
		System.out.println("初始速度为" + speed);
	}
	public int speedUp(int speed) {
		return sped = speed + 5;
	}
	public int speedDown(int speed) {
		return sped = speed - 5;
	}
}
