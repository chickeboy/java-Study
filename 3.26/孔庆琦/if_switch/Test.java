/*
�û����������꣬�£��գ�
�ж�������������Ƿ�Ϸ���
������Ϸ������������˸���������ʾ��������
�������Ϸ�����������ڡ�
��ʾ��
һ�������壬�ߣ��ˣ�ʮ����(ʮ��)�Ǵ���(31��)
���¿�����28��(ƽ��)Ҳ������29��(����)
�Ȳ��Ǵ���Ҳ����С��
ʣ�µ��ģ������ţ�ʮһ����С��(30��)
*/


import java.util.*;
public class Test{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		//1.¼������
		int year = 0 ;
		System.out.println("��������");
		year = scn.nextInt();
		int month = 0;
		System.out.println("��������");
		month = scn.nextInt();
		int day = 0;
		System.out.println("��������");
		day = scn.nextInt();
		//2.��ʶ�Ե��ж�
		boolean flag = true;//��ʾ����ĺϷ��ԣ��������ݵĺϷ��ԣ������ᷢ���ı�
		if(year<0||month > 12||month < 0 || day >31 || day < 0){
			flag = false;//��ʾ���Ϸ�
		}
		//����һ�򣬰��겻���İ�������
		//��¼�Ƿ��������״̬
		boolean isRun = false;
		if(year % 4 == 0 && year % 100 !=0 || year % 400==0){
			isRun = true;
		}
		//�ж������ĺϷ���
		int days = 0;//��¼������·�Ӧ���е�����
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
						days = 31;//���ô���Ĵ�͸�����д��������ĸ�ֵ31��
						break;
			case 4:
			case 6:
			case 9:
			case 11:
						days = 30;
						break;//��ʾС��
			case 2://����ͷ�������ж�
						if(isRun){//isRun == true
							days = 29;
						}else{
							days = 28;
						}
						break;
			
			}
			if(day > days){//�ж�����û�������մ����˵�ǰ�·ݶ�Ӧ��������
				flag = false;
			}
			if(flag){
				System.out.println("�����������Ϊ............." + year +"��" +month+"��" + day+"��");
			}else{
				System.out.println("����������ڲ��Ϸ�");
			}
		
		
		
		
	}
}