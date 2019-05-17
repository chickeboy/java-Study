import java.util.Scanner;

/*2.请定义一个交通工具(Vehicle)的类，其中有:
属性：速度(speed)，体积(size)等等
方法：移动(move())，设置速度(setSpeed(int speed))，加速speedUp(),减速speedDown()等等.
最后在测试类Vehicle中的main()中实例化一个交通工具对象，并通过方法给它初始化speed,size的值，
并且通过打印出来。另外，调用加速，减速的方法对速度进行改变。（类的成员变量）
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
			System.out.println("输入1加速输入2减速");
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
		System.out.println("初始速度为" + sp);

	}
}

class Speedup {
	public void speedUp(int sp) {
		 sp = sp + 5;
		 System.out.println("速度为" + sp);
	}
}

class Speeddown {
	public void speedDown(int sp) {
		 sp = sp - 5;
		 System.out.println("速度为" + sp);
	}
}
