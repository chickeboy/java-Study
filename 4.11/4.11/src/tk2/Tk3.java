package tk2;

/*
 * ��20+21+22+...+263֮�͡�(ע����2�Ĵ���)
 */
public class Tk3 {
	public static void main(String[] args) {
		double sum = 0;
		// �������䣬ָ���ڵ���
		for (int i = 0; i < 64; i++) {
			sum = sum + Math.pow(2, i);
		}
		System.out.println(sum);
	}
}
