package tk2;

/*
 * 12+32+52+...+992֮�͡�(ע��2��ָ��)
 */
public class Tk4 {
	public static void main(String[] args) {
		double sum = 0;
		// �����ڱ䣬ָ������
		for (int i = 1; i < 100; i+=2) {
			sum = sum + Math.pow(i, 2);
		}
		System.out.println(sum);
	}
}
