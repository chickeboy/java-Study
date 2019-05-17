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
		System.out.println("======最终结果======");
	System.out.println("a"+ "\t" + "b" + "\t" + "+" + "\t" + "-" + "\t" + "*" + "\t" + "/" );
	System.out.println(a+ "\t" + b + "\t" + c + "\t" + d + "\t" + e + "\t" + f);
	}
}*/
/*12.写一个程序，要求华氏温度和摄氏温度互相转换，
从华氏度变成摄氏度输出，从摄氏度变成华氏度输出。
提示：从华氏度变成摄氏度只要减去32，乘以5再除以9，
将摄氏度转成华氏度直接乘以9，除以5，加上32。*/
/*import java.util.Scanner;
public class zuoye2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入摄氏度");
		float a = scanner.nextFloat();
		System.out.println("请输入华氏度");
		float b = scanner.nextFloat();
		System.out.println("你输入的摄氏度为：" + a + "转换后的华氏度为：" + a*9/5+32);
		System.out.println("你输入的华氏度为：" + b + "转换后的摄氏度为：" + (b-32)*5/9);
	}
}*/
/*已知 a,b是整型变量，写出将2个变量中值互换的程序*/
/*public class zuoye2{
	public static void main(String[] args){
		int a = 3;
		int b = 4;
		System.out.println("a =" + a + "b = " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("变换后为：" + "a=" + a + "b=" + b);
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
