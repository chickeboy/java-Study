/*import java.util.Scanner;
public class zuoye2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		float a = scanner.nextInt();
		float b = scanner.nextInt();
		float c = a+b;
		float d = a-b;
		float e = a*b;
		float f = a/b;
		System.out.println("======���ս��======");
	System.out.println("a"+ "\t" + "b" + "\t" + "+" + "\t" + "-" + "\t" + "*" + "\t" + "/" );
	System.out.println(a+ "\t" + b + "\t" + c + "\t" + d + "\t" + e + "\t" + f);
	}
}*/
/*12.дһ������Ҫ�����¶Ⱥ������¶Ȼ���ת����
�ӻ��϶ȱ�����϶�����������϶ȱ�ɻ��϶������
��ʾ���ӻ��϶ȱ�����϶�ֻҪ��ȥ32������5�ٳ���9��
�����϶�ת�ɻ��϶�ֱ�ӳ���9������5������32��*/
/*import java.util.Scanner;
public class zuoye2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������϶�");
		float a = scanner.nextFloat();
		System.out.println("�����뻪�϶�");
		float b = scanner.nextFloat();
		System.out.println("����������϶�Ϊ��" + a + "ת����Ļ��϶�Ϊ��" + a*9/5+32);
		System.out.println("������Ļ��϶�Ϊ��" + b + "ת��������϶�Ϊ��" + (b-32)*5/9);
	}
}*/
/*��֪ a,b�����ͱ�����д����2��������ֵ�����ĳ���*/
/*public class zuoye2{
	public static void main(String[] args){
		int a = 3;
		int b = 4;
		System.out.println("a =" + a + "b = " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("�任��Ϊ��" + "a=" + a + "b=" + b);
	}
}*/
/*
import java.text.DecimalFormat; 
import java.util.Scanner;  
public class zuoye2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df =new DecimalFormat("#.00");
		double a = scanner.nextDouble();		
		System.out.println(df.format(a));
	}
}*/
/*
import java.util.Scanner; 
public class zuoye2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		a = a/100*100;
		System.out.println(a);
	}
}*/
/*import java.util.Scanner; 
public class zuoye2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = a%10 + a/10%10 + a/100;
		System.out.println(b);
	}
}*/
/*
import java.util.Scanner; 
public class zuoye2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		char b = a.charAt(0);
		int c = (int)b+1;
		System.out.println((char)c);
	}
}*/
import java.util.Scanner; 
public class zuoye2{
	public static void main(String[] args){
		Scanner  scanner = new Scanner(System.in);
		String str = scanner.next();
		char b = str.charAt(0);
		int c = (int)b-32;
		System.out.println((char)c);
		
	}
}
