package tk3;

public class Tk6 {
	public static void main(String[] args) {
		int num = 1;
		for (int i = 1; i < 11;) {
			if (num % 17 == 0) {
				System.out.println(num);
				i++;// ��¼ʵ�����������Ĵ���
			}
			num++;
		}
	}
}
