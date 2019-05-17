//键盘输入一个数，求出它的绝对值
import java.util.Scanner;
public class HK4{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		a = Math.abs(a);
		System.out.println(a);
	}
}