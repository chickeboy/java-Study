import java.util.Scanner;

/*��������һ����������Ϊ����ĳ��ȣ�������Ӧ�����飬
 * Ҫ���û�¼��4�����ݣ�������ֻ�ܴ�����������������¼�룬���¼�븺��������ʾ����������*/
public class Test8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���봴�����鳤��");
		int a = scanner.nextInt();
		int arry[] = new int[a];
		for (int i = 0; i < arry.length; i++) {
			System.out.println("�������" + (i+1) + "����");
			int b = scanner.nextInt();
			if (b > 0) {
				arry[i] = b;
			} else {
				System.out.println("��������");
				i--;
			}
		}
	}
}
