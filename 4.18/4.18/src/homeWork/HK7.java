package homeWork;

import java.util.Scanner;
/*编写求圆的面积的方法，并调用该函数求出圆环的面积*/
public class HK7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();
		int r1 = scanner.nextInt();
		System.out.println("圆的半径为："+r+"圆的半径为："+r1+"圆环的面积为"+area(r, r1));
	}
	public static double area(int r,int r1) {
		if(r>r1) {
			return Math.pow(r, 2)*Math.PI- Math.pow(r1, 2)*Math.PI;
		}else {
			return Math.pow(r1, 2)*Math.PI-Math.pow(r, 2)*Math.PI;
		}
	}

}
