package fortk;

/*
 * 1.����һ������Ϊ��FlipFlop������ϷӦ�ó���
 * ����1������100������3�ı������滻Ϊ���ʡ�Flip��,
 * 5�ı������滻Ϊ���ʡ�Flop��,
 * ��Ϊ3�ı�����Ϊ5�ı������滻Ϊ���ʡ�FlipFlop��,
 * ��������������ǰ����
 */
public class Tk1 {
	public static void main(String[] args) {
		String str = null;
		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				str = "FlipFlop";
			} else if (i % 3 == 0) {
				str = "Flip";
			} else if (i % 5 == 0) {
				str = "Flop";
			} else {
				str = i + "";
			}
			System.out.println(str);
		}

	}
}
