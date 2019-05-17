import java.util.Scanner;
public class Test2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入三位数：");
		int num = scanner.nextInt();
		int c = num/100;
		int a = num/10%10;
		int b = num%10;
		num = b*100 + a*10 + c;
		System.out.println("变换后的数字为："+num);
	}
}