package tk;

/*
 * ѭ����һ�ֽṹ
 * ��ʼ������
 * do{
 * 
 * 
 * �������
 * } while(���ʽ)
 * ���������Ƿ����㣬ѭ���ض���ִ��һ��
 * �ڶ��ο�ʼ��ȻҪ�ж��Ƿ��������ѭ��������
 */
public class Tk12 {
	public static void main(String[] args) {
		int i = 2;
		while (i > 3) {// ���ж�
			System.out.println("while..." + i);
			i++;
		}
		do {
			System.out.println("do while..." + i);
			i++;
		} while (i > 3);
	}
}
