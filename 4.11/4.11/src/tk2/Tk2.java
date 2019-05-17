package tk2;

/*
 * 求1-1/3+1/5-1/7+1/9...-1/99+1/101之和。
 */
public class Tk2 {
	public static void main(String[] args) {
		// 1.分成两部分操作
		// 1.求所有正数的和 求所有负数的和，然后相减
		double sum1 = 0;
		for (int i = 1; i < 102; i += 4) {
			sum1 += 1.0 / i;// 防止精度损失
		}
		double sum2 = 0;
		for (int i = 3; i < 100; i += 4) {
			sum2 += 1.0 / i;// 防止精度损失
		}
		System.out.println(sum1 - sum2);
		// 用一个循环做完
		double sum = 0;
		// int a = 1;
		for (int i = 1; i < 102; i += 2) {
			// 每次循环结束符号要改变
			sum = sum + 1.0 / i * Math.pow(-1, i / 2);
		}
	}
}
