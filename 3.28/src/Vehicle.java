import java.util.Scanner;
/*2.�붨��һ����ͨ����(Vehicle)���࣬������:
���ԣ��ٶ�(speed)�����(size)�ȵ�
�������ƶ�(move())�������ٶ�(setSpeed(int speed))������speedUp(),����speedDown()�ȵ�.
����ڲ�����Vehicle�е�main()��ʵ����һ����ͨ���߶��󣬲�ͨ������������ʼ��speed,size��ֵ��
����ͨ����ӡ���������⣬���ü��٣����ٵķ������ٶȽ��иı䡣����ĳ�Ա������
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
			System.out.println("����1��������2����");
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
		System.out.println("��ʼ�ٶ�Ϊ" + speed);
	}
	public int speedUp(int speed) {
		return sped = speed + 5;
	}
	public int speedDown(int speed) {
		return sped = speed - 5;
	}
}
