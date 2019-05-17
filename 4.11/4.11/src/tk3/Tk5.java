package tk3;

/*
 * 求出1-1000中所有即可以被3也可以被5整除的数的和
 */
public class Tk5 {
	public static void main(String[] args) {
		double sum = 0;
		for (int i = 1; i < 1001; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
