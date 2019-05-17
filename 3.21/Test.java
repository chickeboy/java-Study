import java.util.Scanner;
public class Test {
	public static void main(String[] aargs){
	Scanner scanner = new Scanner(System.in);//设置键盘输入的工具
	System.out.println("请输入一个字符：");
	String str = scanner.next();
	char c = str.charAt(0);
	c += 32;//等同于c = (char)(c+32);
	System.out.println("编译后的字母为" + c);
	}
}