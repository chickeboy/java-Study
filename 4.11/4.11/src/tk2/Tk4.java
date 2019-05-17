package tk2;

/*
 * 12+32+52+...+992之和。(注意2是指数)
 */
public class Tk4 {
	public static void main(String[] args) {
		double sum = 0;
		// 底数在变，指数不变
		for (int i = 1; i < 100; i+=2) {
			sum = sum + Math.pow(i, 2);
		}
		System.out.println(sum);
	}
}
