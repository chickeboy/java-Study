package tk;

/*
 * 已知序列1/2,2/3,3/5,5/8,...,求其前20项之和
 * 1	2	3	5		a
 * 2	3	5	8		b
 * 下一次循环的分子就是这一次循环的分母
 * 下一次的分母就是这一次的分子和分母的和
 * c 保留 a + b的值就可以了
 * a = b
 * b = c
 */
public class Tk4 {
	public static void main(String[] args) {
		double a = 1;
		double b = 2;
		double c = 0;
		double sum = 0;
		for (int i = 0; i < 20; i++) {
			sum = sum + a / b;
			c = a + b;
			a = b;
			b = c;
		}
		System.out.println(sum);
	}
}
