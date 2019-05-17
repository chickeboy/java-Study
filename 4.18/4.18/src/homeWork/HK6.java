package homeWork;

import java.util.Scanner;

/*6.编写一个方法，可以求出2个数中较大的数，并且调用求出3个数中较大的数*/
public class HK6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		System.out.println(compare(a,b));
		System.out.println(compare(compare(a,b),c));
	}
	public static int  compare(int a,int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}

}
