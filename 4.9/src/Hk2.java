import java.util.Scanner;

/*2.��֪����ax2+bx+c=0��ϵ��ֵ����b2-4ac>0�����󷽳̵ĸ���*/
public class Hk2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������ϵ��");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		double d = Math.pow(b, 2)-4*a*c;
		double x1 = 0;
		double x2 = 0;
		if(d>0) {
			System.out.println("������������");
			x1 = (-b+Math.sqrt(d))/2/a;
			x2 = (-b-Math.sqrt(d))/2/a;
		}
		if(d==0) {
			System.out.println("������һ����");
            x1 = x2 ;
            x2 = -b/2*a;
		}
		if(d<0) {
			System.out.println("û��ʵ����");
		}
		System.out.println(x1+"\t"+x2);
	}

}
