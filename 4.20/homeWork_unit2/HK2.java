//�ж�������֮���Ƿ�С��50�����100
import java.util.Scanner;
public class HK2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		String str = a*b*c>100||a*b*c<50? "��":"����";
		System.out.println("����֮��"+str+"С��50�����100");
	}
}