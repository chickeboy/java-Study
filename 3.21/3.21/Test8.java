//
import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		//��������һ����λ�����������
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ����λ��");
		int num = scanner.nextInt();
		//�� ʮ  ��   123
		//1.ȡ��3��λ���ϵ���
		int a = num / 100;//������ʧ  1
		int c = num % 10;//%ȡ����
		int b = num / 10 % 10;
		num = c * 100 + b * 10 + a;
		System.out.println(num);
	}
}