package hk;
//2.��1!+2!+3!+...+20!֮�͡�
public class HK2{
public static void main(String[]agrs){
	double sum=0;
	double a=1;
		for(int n=1;n<21;n++){
			a*=n;
		}
		sum+=a;//sum��ԓ��forѭ�h�ڲ���a
		System.out.println("1!+2!+3!+...+20!֮��Ϊ"+sum);
	}
}
