package ketang;

import java.util.Scanner;

/*.��дһ����������һ���ַ���ȫ����ɴ�д��2�ַ�����*/
public class TK4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������ַ���");
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
