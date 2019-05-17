package HK1;

import java.util.Scanner;

/*1.猜数字游戏：一个类A有一个成员变量v，有一个初值100。
定义一个类，对A类的成员变量v进行猜。如果大了则提示大了，
小了则提示小了。等于则提示猜测成功。（类的成员变量）*/
public class HK1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =  new Scanner(System.in);
		A a = new A();
		for(int i = 0;;i++) {
			int v = scanner.nextInt();
			if(a.gess(v)!=false) {
				break;
			}
				
		}
	}
}
