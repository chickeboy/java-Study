import java.util.Scanner;

/*创建一个长度为5的数组，手动录入5个整数数据，并且遍历输出
*/
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int arry[] = new int[5];
		for(int i = 0;i<arry.length;i++) {
			arry[i] = scanner.nextInt();
		}
		for(int i = 0;i<arry.length;i++) {
			System.out.println(arry[i]);
		}
	}

}
