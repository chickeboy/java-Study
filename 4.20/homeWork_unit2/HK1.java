//�ж�һ�����Ƿ�Ϊż��
import java.util.Scanner;
public class HK1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		String str = a%2==0? "��":"����";
		System.out.println(a+str+"ż��");
	}
}