package hk5;

import java.util.Scanner;

public class Array {
	public int array(int i) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int array;
		System.out.println("¼�����ݣ�����quit����¼��");
		String str = scanner.next();
			int index = i;
			if (str.equals("quit")) {
				if (index<4) {
					throw new ArrayIndexOutOfBoundsException("�����������������");
				}
			}
			try {
				array = Integer.parseInt(str);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				throw new NumberFormatException("����������");
			}
		return array;
	}
}
