package fortk;

/*
 * ������������ƽ�������ķ��˵�����֮����1053��
 * �����ķ��˵�������ƽ������������֮����873�����д�������������������˵��������Ƕ���
 */
public class Tk3 {
	public static void main(String[] args) {
		for (int i = 0; i < 150; i++) {
			for (int j = 0; j < 150; j++) {
				if (i * i + j == 1053 && j * j + i == 873) {
					System.out.println(i + "," + j);
				}
			}

		}
	}
}
