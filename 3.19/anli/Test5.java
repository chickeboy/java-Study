/*
从键盘输入三角形的底边及高的长度，求其面积
*/
import java.util.*;
public class Test5{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入半径");
		double r = scanner.nextDouble();
		double sum = Math.PI * Math.pow(r,2);
		//Math工具类，提供了数学运算的公式
		System.out.println("圆面积是..." + sum);
	}
	
}