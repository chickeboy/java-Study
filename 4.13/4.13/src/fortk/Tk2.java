package fortk;

/*
 * һ��������������100����һ����ȫƽ������
 * �ټ���168����һ����ȫƽ���������ʸ����Ƕ���
 * 16 4 * 4
 * 9
 * 4 25
 */
public class Tk2 {
	public static void main(String[] args) {
		for (int i = -10000; i < 10000; i++) {
			int x = (int) Math.sqrt(i + 100);
			int y = (int) Math.sqrt(i + 268);
			if (x * x == i + 100 && y * y == i + 268) {
				System.out.println(i);
			}
		}
	}
}
