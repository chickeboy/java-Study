package tk1;

import java.util.Scanner;

public class Tk2 {
	public static void main(String[] args) {
		// ���������
		System.out.println("������һ��С��");
		Scanner scanner = new Scanner(System.in);
		// ��֤�ڽ������ݵ��Ƿ񲻱���
		String str = scanner.next();
		// Ҫ�����յ��ַ���ת����double����
		// ��ת��С�������ǻ��ǲ��ܴ��ַ�����
		try {
			double d = Double.parseDouble(str);
			System.out.println(d);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		// int �� String�Ļ���ת��
		String s = "123";
		int a = 0;
		a = Integer.valueOf(s);// ���ﷵ�ص���Integer����һ���Զ�����Ķ���
		a = Integer.parseInt(s);// ֱ�ӷ���int
		s = a + "";
		s = String.valueOf(a);
		// ��ν�һ��1���Object���͵�1
		int x = 1;
		Integer integer = x;
		Object object = integer;
		System.out.println(object);
	}
}
