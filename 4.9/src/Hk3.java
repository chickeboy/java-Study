import java.util.Scanner;

/*键盘输入一个百分制数，请输出它所对应的成绩等级
提示：
0 - 60（不包含）E
60 - 70（不包含）D
70 - 80（不包含）C
80 - 90（不包含）B
90 - 100（包含）A*/
public class Hk3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入百分制成绩");
		int a = scanner.nextInt();
		char b = 'A';
		if (a >= 0 && a < 60) {
			b = 'E';
		} else if (a >= 60 && a < 70) {
			b = 'D';
		} else if (a >= 70 && a < 80) {
			b = 'C';
		} else if (a >= 80 && a < 90) {
			b = 'B';
		}
		System.out.println(b);
	}

}
