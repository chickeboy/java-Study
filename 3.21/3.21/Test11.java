//
import java.util.Scanner;
public class Test11{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ����");
		double num1 = scanner.nextDouble();
		System.out.println("������һ����");
		double num2 = scanner.nextDouble();
		System.out.println("������һ������");
		String str = scanner.next();
		char c = str.charAt(0);
		boolean flag = true;//��ʾ��ȷ��
		double sum = 0;//���ֵ
		if(c == '+'){
			sum = num1 + num2;
		}else if(c == '-'){
			sum = num1 - num2;
		}else if(c == '*'){
			sum = num1 * num2;
		}else if(c == '/'){
			sum = num1 / num2;
		}else{
			flag = false;//ֻ���ڴ����ʱ��flag�Ż���false
		}
		if(flag == true){
			System.out.println(num1 + "" + c + num2 + "=" + sum);
		}else{
			System.out.println("��������");
		}
	}
}