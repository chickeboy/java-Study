package tk;

//求出1-1000中所有即可以被3也可以被5整除的数的和
public class Tk8 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while (i <= 1000) {
			if (i % 3 == 0 && i % 5 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
	}
}
