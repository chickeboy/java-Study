import java.util.Scanner;

public class Test {
	/*
	 * 10.键盘输入一个百分制数，请输出它所对应的成绩等级 提示： 0 - 60（不包含）E 60 - 70（不包含）D 70 - 80（不包含）C 80 -
	 * 90（不包含）B
	 * 
	 * 90-100（包含）A
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个百分制数字");
		float a = scanner.nextFloat();
		if(a>=0&&a<=100) {
			int b = (int)a/10;
			switch(b) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("E");
				break;
			case 6:
				System.out.println("D");
				break;
			case 7:
				System.out.println("C");
				break;
			case 8:
				System.out.println("B");
				break;
			default:
				System.out.println("A");
				break;
			}
		}else {
			System.out.println("你输入的内容有误");
		}
	}

}
