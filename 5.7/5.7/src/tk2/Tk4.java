package tk2;

public class Tk4 {
	public static void main(String[] args) {
		// ��̬�ڲ����ڴ��������ʱ����Ҫ�ⲿ��Ķ���
		O.I i = new O.I();
	}
}

class O {
	private static String name = "O";

	// ��̬�ڲ�������ⲿ��ĳ�Ա���ԣ�Ҳ�����Ǿ�̬��
	static class I {
		// private String name = "I";

		public void show() {
			// System.out.println(name);
			System.out.println(name);
		}
	}
}
