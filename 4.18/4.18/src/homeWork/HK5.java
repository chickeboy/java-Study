package homeWork;

import java.util.Scanner;

/*5.编写一个方法，可以求出2个数中较大的数，并且调用输出结果*/
public class HK5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(compare(a,b));

	}
	public static int  compare(int a,int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}

}
