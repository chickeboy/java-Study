package tk;

//finally�ؼ��ֵ�ʹ��
//���������쳣����return break
//finally����Ĵ������Ȼ��ִ��
public class Tk4 {
	public static void main(String[] args) {
		try {
			int a = 3 / 0;
		} catch (Exception e) {
			System.out.println("����");
			return;
		} finally {
			System.out.println("over");
		}

	}
}
