package ketang;

import java.util.Scanner;

/*.编写一个方法，将一个字符串全部变成大写（2种方法）*/
public class TK4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入字符串");
		String str = scanner.next();
		char array[] = new char[str.length()];
		array = change(array,str);
		for(int i = 0;i<array.length;i++) {
			System.out.print(array[i]);
		}
	}
	public static char[] change(char[] array,String str) {
		  array = str.toCharArray();
		for(int i =0 ;i<array.length;i++) {
			if(array[i]>='a'&&array[i]<='z') {
				array[i]-=32;
			}
		}
		return array;
	}

}
