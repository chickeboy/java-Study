package hk;
//5.�Ӽ�������һ����������������ǰ���ú����
import java.util.Scanner;
public class HK5{
public static void main(String[]agrs){
	System.out.println("����һ��������");
	Scanner scanner=new Scanner(System.in);
	int a=scanner.nextInt();
	System.out.print("����ǰ���ú�Ϊ");
	for(int i=1;;i++){
		if(a/10==0){
			System.out.print(a);
			break;
			}else{
			int b=a%10;
			a=a/10;
			System.out.print(b);
			}
	}
	}
}