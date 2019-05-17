package fortk;

/*
 * 一个整数，它加上100后是一个完全平方数，
 * 再加上168又是一个完全平方数，请问该数是多少
 * 16 4 * 4
 * 9
 * 4 25
 */
public class Tk2 {
	public static void main(String[] args) {
		for (int i = -10000; i < 10000; i++) {
			int x = (int) Math.sqrt(i + 100);
			int y = (int) Math.sqrt(i + 268);
			if (x * x == i + 100 && y * y == i + 268) {
				System.out.println(i);
			}
		}
	}
}
