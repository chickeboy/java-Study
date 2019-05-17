import java.util.Scanner;

/*9.模拟智力测验程序，提出3个问题，实现准备好答案（是或者否即可），最后统计该用户答错了几题*/
public class Hk9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str;
		int temp = 0;
		char ch;
		System.out.println("5>4?");
		str = scanner.next();
		 ch = str.charAt(0);
		if (ch == '否') {
			temp += 1;
		}
		System.out.println("5<4?");
		str = scanner.next();
		 ch = str.charAt(0);
		if (ch == '是') {
			temp += 1;
		}
		System.out.println("4<10?");
		str = scanner.next();
		 ch = str.charAt(0);
		if (ch == '否') {
			temp += 1;
		}
		System.out.println("你答错了" + temp + "道题");
	}

}
