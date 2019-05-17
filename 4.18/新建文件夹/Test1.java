package 新建文件夹;
/*//已知三角形的底边为20，高为10，求其面积。
public class Test1{
	public static void main(String[] args){
		area();
	}
	public static void area(){
		int a = 10;
		int b = 20;
		int s = 10*20/2;
		System.out.println(s);
	}
}*/
/*//2、从键盘输入三角形的底边及高的长度，求其面积。
import java.util.Scanner;
public class Test1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		area(a,b);
	}
	public static void area(int a,int b){
		int s = a*b/2;
		System.out.println(s);
	}
}*/
/*//已知圆的半径为10，求圆的面积。
public class Test1{
	public static void main(String[] args){
		area();
	}
	public static void area(){
		int r = 10;
		double s = Math.pow(r,2)*Math.PI;
		System.out.println(s);
	} 
}*/
//从键盘输入圆的半径值，求圆的面积
import java.util.Scanner;
public class Test1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();
		double s = area(r);
		System.out.println(s);
	}
	public static double area(int r){
		double s = Math.pow(r,2)*Math.PI;
		return s;
	}
}
