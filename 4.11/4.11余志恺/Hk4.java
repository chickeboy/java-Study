package hk;
//4.	��a+aa+aaa+...����2+22+222+2222+22222��ǰn��֮��
import java.util.Scanner;
public class Hk4{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("���ĸ���ѭ��");
		int a=scanner.nextInt();
		System.out.println("ѭ����Ӷ��ٴ�");
		int n=scanner.nextInt();
		int sum = 0;//�ܺ�
		int sum1 = 0;//���ɵ�����
		for (int i = 1;i<=n;i++){
			sum1 = sum1 * 10 + a;
			//System.out.println("�����ɵ���Ϊ"+sum1);
			sum = sum + sum1;
		}
		System.out.println("��ӵĽ��Ϊ"+sum);
}
}