package tk;

/*
 * 求出所有的水仙花数
 */
public class Tk1 {
	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			int a = i / 100;
			int b = i % 10;
			int c = i / 10 % 10;
			if (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3) == i) {
				System.out.println(i);
			}
		}
	}
}
