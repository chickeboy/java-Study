import java.util.Scanner;

/*�Ӽ�������һ���������������׳˲������*/
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a = 1;
		for(int i = 1;i<=n;i++) {
			a=a*i;
		}
		System.out.println(a);
	}

}
