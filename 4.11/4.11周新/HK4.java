package hk;
//4.求a+aa+aaa+...（如2+22+222+2222+22222）前n项之和
import java.util.Scanner;
public class HK4{
public static void main(String[]agrs){
	System.out.println("输入一个1到9数");
	Scanner scanner=new Scanner(System.in);
	int a=scanner.nextInt();
	System.out.println("输入一个正整数");
	int n=scanner.nextInt();
	double sum=0;
		for(int i=1;i<n+1;i++){
			sum+=a*((Math.pow(10,i)-1)/9);
		}			
	System.out.println("a="+a+"		"+"n项"+n+"\n"+"a+aa+aaa+...的和"+sum);
	}
}