//Scanner ��ʱ��һ����Ҫ�����������
import java.util.Scanner;
public class Test4{
	public static void main(String[] args){
		//��ν����û������������ֵ�����ұ�������
		//1.����һ���������ݵĹ���
		Scanner scanner = new Scanner(System.in);
		//2.��ʾ�û���Ҫ��������ݴ���ʲô
		System.out.println("������num1��ֵ");
		//3.����һ�����������������û������ֵ
		int num1 = 0;
		//4.������������ݣ����ұ���
		num1 = scanner.nextInt();//scanner �ṩ�˺ܶ๤�߷���
		//���ռ������������һ��������ֵ
		System.out.println("������num2��ֵ");
		int num2 = 0;
		num2 = scanner.nextInt();
		int sum = 0;
		sum = num1 + num2;//��̨����ѧ����
		System.out.println(num1 + "+" + num2 + "=" +sum);
		//�����ͱ��������� double x = 0.0;
	}
}