package homeWork;

import java.util.Scanner;

/*10.����һ�����飬����Ϊ10��Ҫ���û�¼һ�����ݺ�ѯ���Ƿ�Ҫ���������������*/
public class HK10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arry[] = new int[10];
		for(int i = 0;i<arry.length;i++) {
			arry[i] = scanner.nextInt();
			System.out.println("�Ƿ�Ҫ������y/n");
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
