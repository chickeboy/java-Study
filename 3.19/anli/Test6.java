//�Ӽ�����������İ뾶����������ͱ����
import java.util.Scanner;
public class Test6{
	public static void main(String[] args){
		System.out.println("������һ���뾶");
		Scanner scanner = new Scanner(System.in);
		double r = scanner.nextDouble();
		double are = 4*Math.PI*Math.pow(r,2);
		double v = 4*Math.PI*Math.pow(r,3)/3;
		System.out.println("������Ϊ" + are);
		System.out.println("������Ϊ" + v);
		
	}
}