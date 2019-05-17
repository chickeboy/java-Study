package hk;
//4.求a+aa+aaa+...（如2+22+222+2222+22222）前n项之和
import java.util.Scanner;
public class Hk4{
	  public static void main(String[] args){
	  System.out.println("请输入一个数");
	  Scanner scanner = new Scanner(System.in);
	  int n = scanner.nextInt();
	  int a = 2;
	  int b = 0;
	  for ( int i = 0 ; i < n ; i++){
		  a = a * 10 + n;
		  b = b + a;
	  }
	  System.out.println(b);
      }
}

