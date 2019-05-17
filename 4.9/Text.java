/*//判断两个数之和是否大于100
import java.util.Scanner;
public class Text{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入两个数字");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		if(a+b>100){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
}*/
/*//判断一个数是否为偶数。
import java.util.Scanner;
public class Text{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		if(a%2==0){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
}*/
/*//键盘输入2个数,输出较大的一个数
import java.util.Scanner;
public class Text{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		if(a>b){
			System.out.println(a);
		}else if(a == b){
			System.out.println("两数相等");
		}else{
			System.out.println(b);
		}
	}
}*/
/*//键盘输入一个数，求出它的绝对值
import java.util.Scanner;
public class Text{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		if(a > 0 ){
			System.out.println(a);
		}else{
			a= Math.abs(a);
			System.out.println(a);	
		}
	}
}*/
import java.util.Scanner;
public class Text{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		if(x>0){
			int y = 1;
		}else if(x == 0){
			int y = 0;
		}else{
			int y = -1;
		}
		System.out.println(y);
	}
}