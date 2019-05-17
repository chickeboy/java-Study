package hk;
//3.求1!+5!+9!+...+21!之和。
public class HK3{
public static void main(String[]agrs){
	double sum=0;
	double a=1;
		for(int n=1;n<22;n+=4){
			a*=n;
		}
		sum+=a;
	
	System.out.println("求1!+5!+9!+...+21!之和是"+sum);
	}
}