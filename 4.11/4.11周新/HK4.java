package hk;
//4.��a+aa+aaa+...����2+22+222+2222+22222��ǰn��֮��
import java.util.Scanner;
public class HK4{
public static void main(String[]agrs){
	System.out.println("����һ��1��9��");
	Scanner scanner=new Scanner(System.in);
	int a=scanner.nextInt();
	System.out.println("����һ��������");
	int n=scanner.nextInt();
	double sum=0;
		for(int i=1;i<n+1;i++){
			sum+=a*((Math.pow(10,i)-1)/9);
		}			
	System.out.println("a="+a+"		"+"n��"+n+"\n"+"a+aa+aaa+...�ĺ�"+sum);
	}
}