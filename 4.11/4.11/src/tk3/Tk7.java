package tk3;

/*
 * 20.��1+1/3+1/5+...֮�ͣ�ֱ��ĳһ���ֵС��10-6ʱֹͣ�ۼ�
 */
public class Tk7 {
	public static void main(String[] args) {
		double sum = 0;
		for (int i = 1;; i += 2) {
			if (1.0 / i < Math.pow(10, -6)) {
				break;
			}
			sum += 1.0 / i;
		}
		System.out.println(sum);
	}
}
