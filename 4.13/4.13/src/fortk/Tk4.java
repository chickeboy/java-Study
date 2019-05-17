package fortk;

/*
 * 有两个正整数a和b，已知a*b=2048，
 * 求a、b各为何值时，a+b的值最小
 */
public class Tk4 {
	public static void main(String[] args) {
		int min = 2049;// 初始值
		int minA = 0;
		int minB = 0;
		for (int a = 1; a < 2049; a++) {
			for (int b = 0; b < 2049; b++) {
				if (a + b < min && a * b == 2048) {
					min = a + b;
					minA = a;
					minB = b;
				}
			}
		}
		System.out.println(minA + "," + minB);
	}
}
