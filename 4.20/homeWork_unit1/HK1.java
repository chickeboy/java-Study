//3.在上一题的基础上，在键盘上输入姓名，年龄，性别，手机号码信息，并且按照格式输出
 import java.util.Scanner;
public class HK1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入姓名：");
		String name = scanner.next();
		System.out.println("请输入年龄：");
		int age = scanner.nextInt();
		System.out.println("请输入性别：");
		String sex = scanner.next();
		System.out.println("请输入电话号码：");
		String phonenumber = scanner.next();
		System.out.print("姓名："+name+"\t"+ "年龄"+age+"\n");
		System.out.print("性别："+sex+ "\t" + "手机号码：" + phonenumber+"\n");
	}
}