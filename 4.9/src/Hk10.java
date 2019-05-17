import java.util.Scanner;

/*10.输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数*/
public class Hk10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		String str = scanner.nextLine();
		for (int i = 0; i < str.length(); i++) {
			int a = str.charAt(i);
			if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122)) {
				b += 1;
			} else if (a == 32) {
				c += 1;
			} else if (a >= 48 && a <= 57) {
				d += 1;
			} else {
				e += 1;
			}
		}
		System.out.println(str);
		System.out.println("英文字母个数：" + b + "空格个数：" + c + "数字个数：" + d + "其他字符个数：" + e);
	}

}
