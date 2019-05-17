package tk;

/*
 * 6.求1+4+7+……+100之和
 */
public class Tk8 {
	public static void main(String[] args) {
		int sum = 0;// 求和变量
		for (int i = 1; i < 101; i += 3) {
			// int sum = 0;循环中申请的变量这次循环结束后就消失了
			sum = sum + i;
		}
		System.out.println("和为" + sum);
	}
}
