/*������������ƽ�������ķ��˵�����֮����1053��
�����ķ��˵�������ƽ������������֮����873��
���д�������������������˵��������Ƕ���*/

public class Test2 {
	public static void main(String[] args) {
				
		for (int a = 0;; a++) {
			for (int b = 0; b < a; b++) {
				if (Math.pow(a, 2) + b == 1053 && Math.pow(b, 2) + a == 873) {
					System.out.println(a +"\t"+ b);
				}
			}
		}
	}
}
