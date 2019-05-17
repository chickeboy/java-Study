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
		String name = "黄正生";
		int age = 23;
		String sex = "男";
		long phone = 13506567152l;
		System.out.print("姓名" + name + "\t");
		System.out.print("年龄" + age +  "\t");
		System.out.print("性别" + sex + "\t");
		System.out.print("手机号码" + phone +"\t");
	}
}*/
/*import java.util.Scanner;
public class zuoye{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入姓名");
		String name = scanner.next();
		System.out.println("请输入年龄");
		int age = scanner.nextInt();
		System.out.println("请输入性别");
		String sex = scanner.next();
		System.out.println("请输入电话号码");
		long phone = scanner.nextLong();
		System.out.print("姓名" + name + "\t");
		System.out.print("年龄" + age +  "\t");
		System.out.print("性别" + sex + "\t");
		System.out.print("手机号码" + phone +"\t");
	}
}*/
import java.util.Scanner;
public class zuoye{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入账号");
		int name = scanner.nextInt();
		System.out.println("请输入密码");
		String str = scanner.next();
		char a = str.charAt(0);
		System.out.println("账号为："+ name);
		System.out.print("密码为："+ a);
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
		System.out.println("请输入第一个人的成绩");
		int a = scanner.nextInt();
		System.out.println("请输入第二个人的成绩");
		int b = scanner.nextInt();
		System.out.println("请输入第三个人的成绩");
		int c = scanner.nextInt();
		double d = (a+b+c)/3.0;
		System.out.println("三个人的平均成绩为" + d);
		
	}
}
*/
/*import java.util.Scanner;
public class zuoye{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入姓名");
		String name = scanner.next();
		System.out.println("请输入年龄");
		int age = scanner.nextInt();
		System.out.println("请输入性别");
		String sex = scanner.next();
		System.out.println("请输入分数");
		double a = scanner.nextDouble();
		System.out.println("========学生信息========");
		System.out.print("姓名：" + "\'" + name +"\"");
		System.out.println("年龄：" + age);
		System.out.print("性别：" + "\'" + sex + "\'");
		System.out.println("分数" + a);
	}
}*/