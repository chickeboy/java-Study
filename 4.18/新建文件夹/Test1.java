package �½��ļ���;
/*//��֪�����εĵױ�Ϊ20����Ϊ10�����������
public class Test1{
	public static void main(String[] args){
		area();
	}
	public static void area(){
		int a = 10;
		int b = 20;
		int s = 10*20/2;
		System.out.println(s);
	}
}*/
/*//2���Ӽ������������εĵױ߼��ߵĳ��ȣ����������
import java.util.Scanner;
public class Test1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		area(a,b);
	}
	public static void area(int a,int b){
		int s = a*b/2;
		System.out.println(s);
	}
}*/
/*//��֪Բ�İ뾶Ϊ10����Բ�������
public class Test1{
	public static void main(String[] args){
		area();
	}
	public static void area(){
		int r = 10;
		double s = Math.pow(r,2)*Math.PI;
		System.out.println(s);
	} 
}*/
//�Ӽ�������Բ�İ뾶ֵ����Բ�����
import java.util.Scanner;
public class Test1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();
		double s = area(r);
		System.out.println(s);
	}
	public static double area(int r){
		double s = Math.pow(r,2)*Math.PI;
		return s;
	}
}
