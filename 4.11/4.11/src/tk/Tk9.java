package tk;

//7.求1到100之间的奇数之和与偶数之和
public class Tk9 {
	public static void main(String[] args) {
		// 使用2个循环求解
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 1; i < 100; i += 2) {
			sum1 += i;
		}
		for (int i = 2; i < 101; i += 2) {
			sum2 += i;
		}
		System.out.println("奇数和...." + sum1);
		System.out.println("偶数和...." + sum2);
		// 使用一个循环求解
		sum1 = 0;
		sum2 = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {// 偶数
				sum2 += i;
			} else {
				sum1 += i;// 奇数
			}
		}
		System.out.println("奇数和...." + sum1);
		System.out.println("偶数和...." + sum2);
	}
}
