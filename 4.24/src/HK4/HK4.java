package HK4;

import java.util.Scanner;

/*4.С��������ֻè��һֻ��С�ڣ�����2�꣬
��ɫ����һֻ��С�ף�����5�꣬��ɫ��
���дһ������Ҫ���û�����Сè������ʱ��
����ʾè�����֡��������ɫ������û������Сè���ִ���
����ʾ��С��û������ֻè����*/
public class HK4 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		if(str.equals("С��")) {
			cat.blackcat();
		}else if (str.equals("С��")) {
			cat.whitecat();
		}else {
			System.out.println("С��û������ֻè");
		}
	}
}
