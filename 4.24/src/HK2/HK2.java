package HK2;

import java.util.Scanner;

/*2.�붨��һ����ͨ����(Vehicle)���࣬������:
���ԣ��ٶ�(speed)�����(size)�ȵ�
�������ƶ�(move())�������ٶ�(setSpeed(int speed))������speedUp(),����speedDown()�ȵ�.
����ڲ�����Vehicle�е�main()��ʵ����һ����ͨ���߶��󣬲�ͨ������������ʼ��speed,size��ֵ��
����ͨ����ӡ���������⣬���ü��٣����ٵķ������ٶȽ��иı䡣����ĳ�Ա������*/
public class HK2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Vehicle car =  new Vehicle();
		car.speed = 0;
		car.size = 5;
		while(true) {
			System.out.println("+����"+"-����"+"t�˳�");
			String str = scanner.next();
			if(str.equals("t")) {
				break;
			}
			car.setSpeed(str);
		}
	}

}
