/*
	java�����ݵ�����
	����һ���ļ��У������кܶ๤����
*/
import java.util.Scanner;//����һ�����߰� ���� �ð� lang
public class Test3{
	public static void main(String[] args){
		//����һ���������̽������ݵĹ��߶������scanner
		//ֻ��Ҫ����һ��
		Scanner scanner = new Scanner(System.in);
		//ֻҪ�漰�������������ݣ���������ʾ��������������ݴ���ʲô
		System.out.println("������һ������");
		//��α������������������ڻ�����
		int num = 0;
		num = scanner.nextInt();//scanner.nextInt();
		//������һ�����������
		System.out.println("�����������..." + num);
	}
}