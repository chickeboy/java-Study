package hk;

/*
 * 求1!+2!+3!+...+20!之和
 */
public class Hk2 {
	public static void main(String[] args) {
		double sum = 0;
		double num = 1;// 记录每次i的阶乘
		for (int i = 1; i < 21; i++) {
			num *= i;// num保留了每次循环记录的阶乘值
			sum += num;
		}
		System.out.println(sum);
	}
}
