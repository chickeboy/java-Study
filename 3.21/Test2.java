import java.util.Scanner;
public class Test2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������λ����");
		int num = scanner.nextInt();
		int c = num/100;
		int a = num/10%10;
		int b = num%10;
		num = b*100 + a*10 + c;
		System.out.println("�任�������Ϊ��"+num);
	}
}