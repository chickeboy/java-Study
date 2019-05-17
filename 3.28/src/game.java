import java.util.Scanner;

/*
1.猜数字游戏：一个类A有一个成员变量v，有一个初值100。
定义一个类，对A类的成员变量v进行猜。如果大了则提示大了，
小了则提示小了。等于则提示猜测成功。（类的成员变量）
*/
public class game {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
        b.ccc();
	}
}

class B {
	A a = new A();
	public void ccc() {
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入数字");
			int z = scanner.nextInt();
			a.gess(z);
		}
	}
}

class A {
	int v = 100;
	B b = new B();
	public void gess(int z) {
		if (z > v) {
			System.out.println("大了");
		} else if(z == v){
			System.out.println("恭喜你答对了");
		}else {
			System.out.println("小了");
		}
	}
}
