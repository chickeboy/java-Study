//ģ����������������3�����⣬ʵ��׼���ô𰸣��ǻ��߷񼴿ɣ���
//���ͳ�Ƹ��û�����˼���
import java.util.Scanner;
public class HK7{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		System.out.println("5>3");
		String  str = scanner.next();
		if(str.equals("��")){
			count++;
		}
		System.out.println("5<3");
		str = scanner.next();
		if(str.equals("��")){
			count++;
		}
		System.out.println("5>6");
		str = scanner.next();
		if(str.equals("��")){
			count++;
		}
		System.out.println("�û������"+ count+"����");
	}
}