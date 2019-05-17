package homeWork;

import java.util.Scanner;

/*9.创建一个数组，长度为5，其中只能存放正数，如果是负数，则提示无法录入，要求：用户一定要录满5个数据（保证数组中存满5个合法数据）*/
public class HK9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int arry[] = new int[5];
		for(int i = 0;i<arry.length;) {
			System.out.println("请输入第："+(i+1)+"个数字");
			int a = scanner.nextInt();
			if(a<0) {
				System.out.println("输入有误");
			}else {
				arry[i] = a;
				i++;
			}
		}
	}

}
