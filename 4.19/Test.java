/*
//.键盘输入一个数，求出它的绝对值
import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println(Math.abs(a));
	}
}*/
/*//.键盘输入x的值，根据以下图片得出y的值
import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = 0;
		if(x>0){
			y=1;
		}else if(x==0){
			y=0;
		}else{
			y=-1;
		}
		System.out.println(y);
	}
}*/
//键盘输入2个数，并且和一个符号(符号限于+-*/%其中一个),得出对应的结果
/*import java.util.Scanner;
public class Test{	
	public static void main(String[] args){
		Scanner  scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = 0;
		String str = scanner.next();
		if(str.equals("+")){
			c = a+b;
		}
		if(str.equals("-")){
			c = a-b;
		}
		if(str.equals("*")){
			c = a*b;
		}
		if(str.equals("/")){
			c = a/b;
		}
		if(str.equals("%")){
			c = a%b;
		}
		System.out.println(c);
	}
}*/
/*//编写求k!的方法，再调用该函数求1!+2！+3！+....10!之和并输出
import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int sum = 0;
		for(int i = 0;i<k;i++){
			sum = sum + factorial(i);
		}
		System.out.println(sum);
	}
	public static int factorial(int k){
		int factorial = 1;
		for(int i = 1;i<=k;i++){
			factorial = factorial*i;
		}
		return factorial;
	}
}*/
/*//编写判断素数的方法，再调用该函数判断1937是否是素数
import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a  = scanner.nextInt();
		String str = primenumber(a) ? "是":"不是";
		System.out.println(a+str+"素数");
	}
	public static boolean 	primenumber(int a){
		boolean bool = true;
		for(int i = 2;i<a;i++){
			if(a%i==0){				
				bool =  false;
				break;
			}
		}
		return bool;
	} 
}*/
//编写判断素数的方法，调用该函数求出1000以内的所有素数之和并输出
/*public class Test{
	public static void main(String[] args){
		int sum = 0;
		for(int i = 1;i<1000;i++){
			if(primenumber(i)){
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
	public static boolean 	primenumber(int a){
		boolean bool = true;
		for(int i = 2;i<a;i++){
			if(a%i==0){				
				bool =  false;
			}
		}
		return bool;
	} 
}*/
//编写判定闰年的方法，并调用此函数判定某一年是否是闰年
/*import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		String str = isRun(year)? "是":"不是";
		System.out.println(year + str + "闰年");
			
	}
	public static boolean isRun(int year){
		if(year%4==0&&year%100!=0||year%400==0){
			return true;
		}else{
			return false;
		}
	}
}*/
//编写判定闰年的方法，并调用此函数求出公元1年到公元1000年之间的所有闰年
/*public class Test{
	public static void main(String[] args){
		int sum = 0;
		for(int i = 1;i<=1000;i++){
			if(isRun(i)){
				sum += i;
			}
		}
		System.out.println(sum);
	}
	public static boolean isRun(int year){
		if(year%4==0&&year%100!=0||year%400==0){
			return true;
		}else{
			return false;
		}
	}
}*/
//编写一个方法，传入一个参数n，返回斐波那契数列第n个数
import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
			System.out.println(math(n));
	}
	public static int math(int n){
		int a = 1;
		int b = 1;
		int c = 0;
		for(int i =1;i<n;i++){
			c = a+b;
			a = b;
			b = c;
		}
		return a;
	}
}


