nnimport java.util.Scanner;

/*��һ�������ֵ���Ϸ������һ��0-10�����������������һ�������ж��Ƿ��ڷ�Χ��
����ǵĴ�ӡ���������ǵĴ�ӡ��������0-10 10-20 �ж����ĸ������ڣ�*/
public class Hk5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = (int) Math.floor(Math.random() * 10);
		System.out.println(b);
		int c = (int) Math.floor(Math.random() * 20 + 10);
		System.out.println(c);
		String str = "��";
		if (a < b || a > c) {
			str = "����";
		}
		System.out.println(a + str + "��Χ�ڵ�����");
	}

}
