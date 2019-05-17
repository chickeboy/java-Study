//从键盘输入球体的半径，求其体积和表面积
import java.util.Scanner;
public class Test6{
	public static void main(String[] args){
		System.out.println("请输入一个半径");
		Scanner scanner = new Scanner(System.in);
		double r = scanner.nextDouble();
		double are = 4*Math.PI*Math.pow(r,2);
		double v = 4*Math.PI*Math.pow(r,3)/3;
		System.out.println("球的面积为" + are);
		System.out.println("球的体积为" + v);
		
	}
}