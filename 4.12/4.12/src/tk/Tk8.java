package tk;

//���1-1000�����м����Ա�3Ҳ���Ա�5���������ĺ�
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
