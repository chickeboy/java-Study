//3.����һ��Ļ����ϣ��ڼ������������������䣬�Ա��ֻ�������Ϣ�����Ұ��ո�ʽ���
 import java.util.Scanner;
public class HK1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("������������");
		String name = scanner.next();
		System.out.println("���������䣺");
		int age = scanner.nextInt();
		System.out.println("�������Ա�");
		String sex = scanner.next();
		System.out.println("������绰���룺");
		String phonenumber = scanner.next();
		System.out.print("������"+name+"\t"+ "����"+age+"\n");
		System.out.print("�Ա�"+sex+ "\t" + "�ֻ����룺" + phonenumber+"\n");
	}
}