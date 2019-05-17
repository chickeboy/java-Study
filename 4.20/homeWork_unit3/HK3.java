//从键盘输入一个正整数n，求1+2+3+...+n之和并输出
import java.util.Scanner;
public class HK3{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int sum = 0;
		for(int i = 1;i<=a;i++ ){
			sum +=i;
		}
		System.out.println(sum);
	}
}