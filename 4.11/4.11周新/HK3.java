package hk;
//3.��1!+5!+9!+...+21!֮�͡�
public class HK3{
public static void main(String[]agrs){
	double sum=0;
	double a=1;
		for(int n=1;n<22;n+=4){
			a*=n;
		}
		sum+=a;
	
	System.out.println("��1!+5!+9!+...+21!֮����"+sum);
	}
}