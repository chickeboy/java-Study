import java.util.Scanner;
public class Test6{
	public static void main(String[] args){
		//字符的创建与接收
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个字符");
		char c = ' ';
		//字符的接收一定要依靠于字符串,我们只要字符串的第一个字符
		String str = scanner.next();
		c = str.charAt(0);//0表示第一个字符
		System.out.println("字符为" + c);//换行
		System.out.println();//是可以没有参数的，就是一个换行功能
		System.out.print(3);//print里面必须有参数
		System.out.print(2);
		//转义字符:在字符串中出现的特殊符号 
			//\t制表符 空一个tab键  \r\n 换行回退
		System.out.println("\'中\"\t");

	}
}

