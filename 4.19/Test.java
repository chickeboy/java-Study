/*
//.��������һ������������ľ���ֵ
import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println(Math.abs(a));
	}
}*/
/*//.��������x��ֵ����������ͼƬ�ó�y��ֵ
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
//��������2���������Һ�һ������(��������+-*/%����һ��),�ó���Ӧ�Ľ��
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
/*//��д��k!�ķ������ٵ��øú�����1!+2��+3��+....10!֮�Ͳ����
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
/*//��д�ж������ķ������ٵ��øú����ж�1937�Ƿ�������
import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a  = scanner.nextInt();
		String str = primenumber(a) ? "��":"����";
		System.out.println(a+str+"����");
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
//��д�ж������ķ��������øú������1000���ڵ���������֮�Ͳ����
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
//��д�ж�����ķ����������ô˺����ж�ĳһ���Ƿ�������
/*import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		String str = isRun(year)? "��":"����";
		System.out.println(year + str + "����");
			
	}
	public static boolean isRun(int year){
		if(year%4==0&&year%100!=0||year%400==0){
			return true;
		}else{
			return false;
		}
	}
}*/
//��д�ж�����ķ����������ô˺��������Ԫ1�굽��Ԫ1000��֮�����������
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
//��дһ������������һ������n������쳲��������е�n����
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


