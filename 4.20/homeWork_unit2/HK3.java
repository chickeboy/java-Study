//��������һ����ݣ��жϸ���������껹��ƽ��
import java.util.Scanner;
public class HK3{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		boolean bool = false;
		if(year%4==0&&year%100!=0||year%400==0){
			bool = true;
		}
		System.out.println(year+"��"+(bool?"����":"ƽ��"));
	}
}