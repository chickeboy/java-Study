package tk;

//7.��1��100֮�������֮����ż��֮��
public class Tk9 {
	public static void main(String[] args) {
		// ʹ��2��ѭ�����
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 1; i < 100; i += 2) {
			sum1 += i;
		}
		for (int i = 2; i < 101; i += 2) {
			sum2 += i;
		}
		System.out.println("������...." + sum1);
		System.out.println("ż����...." + sum2);
		// ʹ��һ��ѭ�����
		sum1 = 0;
		sum2 = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {// ż��
				sum2 += i;
			} else {
				sum1 += i;// ����
			}
		}
		System.out.println("������...." + sum1);
		System.out.println("ż����...." + sum2);
	}
}
