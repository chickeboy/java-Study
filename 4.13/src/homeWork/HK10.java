package homeWork;

import java.util.Scanner;

/*10.创建一个数组，长度为10，要求用户录一条数据后，询问是否要继续，最后遍历输出*/
public class HK10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arry[] = new int[10];
		for(int i = 0;i<arry.length;i++) {
			arry[i] = scanner.nextInt();
			System.out.println("是否要继续：y/n");
			String str = scanner.next();
			if(str.equals("n")) {
				break;
			}
		}
		for(int i = 0;i<arry.length;i++) {
			System.out.println(arry[i]);
		}
	}
}
