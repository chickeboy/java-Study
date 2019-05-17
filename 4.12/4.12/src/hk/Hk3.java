package hk;

/*
 * 求1!+5!+9!+...+21!之和
 */
public class Hk3 {
	public static void main(String[] args) {
		double sum = 0;
		double num = 1;
		for (int i = 1; i < 22; i++) {
			// 每个数的阶乘还是要计算，只是选择性的累加
			num *= i;
			if (i % 4 == 1) {
				sum += num;
			}
		}
		System.out.println(sum);
	}
}
