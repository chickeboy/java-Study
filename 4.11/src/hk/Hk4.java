package hk;
//4.��a+aa+aaa+...����2+22+222+2222+22222��ǰn��֮��
import java.util.Scanner;
public class Hk4{
	  public static void main(String[] args){
	  System.out.println("������һ����");
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

