package hk5;

/*�������еõ�5������������һ���������飬
Ȼ���ӡ�����Ҫ������������ݲ�Ϊ������
Ҫ����Integer.parseInt()�������쳣��
��ʾ����������������������������������5�����쳣
������Խ�磩����ʾ������������5���������� */
public class hk5 {

	public static void main(String[] args) {
		Array array = new Array();
		int a[] = new int[5];
		int i = 0;
		while (true) {
			try {
				a[i] = array.array(i);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				i--;
				System.out.println(e.getMessage());
			}catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
				break;
			}catch (Exception e) {
				// TODO: handle exception
			}
			i++;
		}

		for (int b : a) {
			System.out.println(b);
		}

	}

}
