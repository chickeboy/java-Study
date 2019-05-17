package hk;

//5.	从键盘输入一个正整数，将该数前后倒置后输出
import java.util.Scanner;

public class Hk5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个正整数");
		int a = input.nextInt();
		System.out.print("倒置后输出的数为");
		for (int i = 0; a > 0; i++) {
			if (a / 10 == 0) {
				System.out.print(a);
				break;
			} else {
				System.out.print(a % 10);
				a /= 10;
			}
		}
	}
}

/*
 * import java.util.Scanner; public class P411{ public static void main(String[]
 * args){ Scanner input=new Scanner(System.in); System.out.println("请输入一个正整数");
 * int a=input.nextInt(); System.out.println("倒置后输出为"); int num=1; while(a>0){
 * num=a%10; System.out.print(num); a=a/10; } } }
 */