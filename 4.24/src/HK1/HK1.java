package HK1;

import java.util.Scanner;

/*1.��������Ϸ��һ����A��һ����Ա����v����һ����ֵ100��
����һ���࣬��A��ĳ�Ա����v���в¡������������ʾ���ˣ�
С������ʾС�ˡ���������ʾ�²�ɹ�������ĳ�Ա������*/
public class HK1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =  new Scanner(System.in);
		A a = new A();
		for(int i = 0;;i++) {
			int v = scanner.nextInt();
			if(a.gess(v)!=false) {
				break;
			}
				
		}
	}
}
