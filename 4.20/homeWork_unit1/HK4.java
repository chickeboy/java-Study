//键盘输入3个人的成绩，求出平均值
import java.util.Scanner;
public class HK4{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		double d = (a+b+c)/3;
		System.out.println(d);
	}
}