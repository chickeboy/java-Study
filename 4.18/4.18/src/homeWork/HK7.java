package homeWork;

import java.util.Scanner;
/*��д��Բ������ķ����������øú������Բ�������*/
public class HK7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();
		int r1 = scanner.nextInt();
		System.out.println("Բ�İ뾶Ϊ��"+r+"Բ�İ뾶Ϊ��"+r1+"Բ�������Ϊ"+area(r, r1));
	}
	public static double area(int r,int r1) {
		if(r>r1) {
			return Math.pow(r, 2)*Math.PI- Math.pow(r1, 2)*Math.PI;
		}else {
			return Math.pow(r1, 2)*Math.PI-Math.pow(r, 2)*Math.PI;
		}
	}

}
