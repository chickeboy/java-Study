/*public class zuoye{
	public static void main(String[] args){
		System.out.println(" * *************************** *");
		System.out.println();
		System.out.println("*        hello,world	       *");
		System.out.println();
		System.out.println(" * *************************** *");
	}
}*/
/*public class zuoye{
	public static void main(String[] args){
		String name = "������";
		int age = 23;
		String sex = "��";
		long phone = 13506567152l;
		System.out.print("����" + name + "\t");
		System.out.print("����" + age +  "\t");
		System.out.print("�Ա�" + sex + "\t");
		System.out.print("�ֻ�����" + phone +"\t");
	}
}*/
/*import java.util.Scanner;
public class zuoye{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������");
		String name = scanner.next();
		System.out.println("����������");
		int age = scanner.nextInt();
		System.out.println("�������Ա�");
		String sex = scanner.next();
		System.out.println("������绰����");
		long phone = scanner.nextLong();
		System.out.print("����" + name + "\t");
		System.out.print("����" + age +  "\t");
		System.out.print("�Ա�" + sex + "\t");
		System.out.print("�ֻ�����" + phone +"\t");
	}
}*/
import java.util.Scanner;
public class zuoye{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������˺�");
		int name = scanner.nextInt();
		System.out.println("����������");
		String str = scanner.next();
		char a = str.charAt(0);
		System.out.println("�˺�Ϊ��"+ name);
		System.out.print("����Ϊ��"+ a);
		for(int i = 0; i < str.length()-1;i++);
		System.out.print("*");
		
	}
}
/*
import java.util.Scanner;
public class zuoye{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = a*a+b*b;
		System.out.println(c);
	}
	
}*/
/*import java.util.Scanner;
public class zuoye{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		double b = Math.sqrt(a);
		System.out.println(b);
	}
}*/
/*
import java.util.Scanner;
public class zuoye{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������һ���˵ĳɼ�");
		int a = scanner.nextInt();
		System.out.println("������ڶ����˵ĳɼ�");
		int b = scanner.nextInt();
		System.out.println("������������˵ĳɼ�");
		int c = scanner.nextInt();
		double d = (a+b+c)/3.0;
		System.out.println("�����˵�ƽ���ɼ�Ϊ" + d);
		
	}
}
*/
/*import java.util.Scanner;
public class zuoye{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������");
		String name = scanner.next();
		System.out.println("����������");
		int age = scanner.nextInt();
		System.out.println("�������Ա�");
		String sex = scanner.next();
		System.out.println("���������");
		double a = scanner.nextDouble();
		System.out.println("========ѧ����Ϣ========");
		System.out.print("������" + "\'" + name +"\"");
		System.out.println("���䣺" + age);
		System.out.print("�Ա�" + "\'" + sex + "\'");
		System.out.println("����" + a);
	}
}*/