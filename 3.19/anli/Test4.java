/*
从键盘输入三角形的底边及高的长度，求其面积
*/
import java.util.*;
public class Test4{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入底边");
		double base = scanner.nextDouble();
		System.out.println("请输入高");
		double high = scanner.nextDouble();
		double sum = base * high / 2;
		System.out.println("三角形的面积是..." + sum);
	}
	
}