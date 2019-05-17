package hk;
//4.	求a+aa+aaa+...（如2+22+222+2222+22222）前n项之和
import java.util.Scanner;
public class Hk4{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("用哪个数循环");
		int a=scanner.nextInt();
		System.out.println("循环相加多少次");
		int n=scanner.nextInt();
		int sum = 0;//总和
		int sum1 = 0;//生成的新数
		for (int i = 1;i<=n;i++){
			sum1 = sum1 * 10 + a;
			//System.out.println("新生成的数为"+sum1);
			sum = sum + sum1;
		}
		System.out.println("相加的结果为"+sum);
}
}