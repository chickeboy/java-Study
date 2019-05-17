package hk;
//5.从键盘输入一个正整数，将该数前后倒置后输出
import java.util.Scanner;
public class HK5{
public static void main(String[]agrs){
	System.out.println("输入一个正整数");
	Scanner scanner=new Scanner(System.in);
	int a=scanner.nextInt();
	System.out.print("该数前后倒置后为");
	for(int i=1;;i++){
		if(a/10==0){
			System.out.print(a);
			break;
			}else{
			int b=a%10;
			a=a/10;
			System.out.print(b);
			}
	}
	}
}