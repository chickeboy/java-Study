import java.util.Scanner;

/*2.�붨��һ����ͨ����(Vehicle)���࣬������:
���ԣ��ٶ�(speed)�����(size)�ȵ�
�������ƶ�(move())�������ٶ�(setSpeed(int speed))������speedUp(),����speedDown()�ȵ�.
����ڲ�����Vehicle�е�main()��ʵ����һ����ͨ���߶��󣬲�ͨ������������ʼ��speed,size��ֵ��
����ͨ����ӡ���������⣬���ü��٣����ٵķ������ٶȽ��иı䡣����ĳ�Ա������
*/
public class test {
	public static void main(String[] args) {
		Move move = new Move();
		Setspeed setspeed = new Setspeed();
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int sp = scanner.nextInt();
		move.move(sp);
		setspeed.setSpeed(sp);
	}
}

class Setspeed {
	public void setSpeed(int sp) {
		Move move = new Move();
		Speedup speedup = new Speedup();
		Speeddown speeddown = new Speeddown();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("����1��������2����");
			int a = scanner.nextInt();
			if (a == 1) {
				speedup.speedUp(sp);
			}else if(a == 2) {
				speeddown.speedDown(sp);
			}else {
				break;
			}
		}
	}
}

class Move {
	public void move(int sp) {
		System.out.println("��ʼ�ٶ�Ϊ" + sp);

	}
}

class Speedup {
	public void speedUp(int sp) {
		 sp = sp + 5;
		 System.out.println("�ٶ�Ϊ" + sp);
	}
}

class Speeddown {
	public void speedDown(int sp) {
		 sp = sp - 5;
		 System.out.println("�ٶ�Ϊ" + sp);
	}
}
