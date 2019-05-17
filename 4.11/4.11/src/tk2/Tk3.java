package tk2;

/*
 * 求20+21+22+...+263之和。(注意是2的次幂)
 */
public class Tk3 {
	public static void main(String[] args) {
		double sum = 0;
		// 底数不变，指数在递增
		for (int i = 0; i < 64; i++) {
			sum = sum + Math.pow(2, i);
		}
		System.out.println(sum);
	}
}
