package hk1;

/*
 * ʹ��whileѭ����˫��ѭ����ӡ��99�˷���
 * 1 * 1
 * 2 * 1  2 * 2
 * 3 * 1  3 * 2  3 * 3
 */
public class Hk1 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}
		int x = 1;// ��������
		int y = 1;
		while (x < 10) {
			System.out.print(x + "*" + y + "=" + x * y + "\t");
			y++;// y == x��ʱ��Ӧ�û�����
			if (y > x) {
				x++;// ����
				y = 1;// y���´�1��ʼ����
				System.out.println();
			}
		}
	}
}
