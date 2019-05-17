import java.util.Scanner;

/*创建一个长度为4的数组，手动录入4个整数数据，遍历输出所有能够被3整除的数*/

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner scanner = new Scanner(System.in);
				int arry[] = new int[5];
				for(int i = 0;i<arry.length;i++) {
					arry[i] = scanner.nextInt();
				}
				for(int i = 0;i<arry.length;i++) {
					if(arry[i]%3==0) {
						System.out.println(arry[i]);
					}
				}
	}

}
