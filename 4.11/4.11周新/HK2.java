package hk;
//2.求1!+2!+3!+...+20!之和。
public class HK2{
public static void main(String[]agrs){
	double sum=0;
	double a=1;
		for(int n=1;n<21;n++){
			a*=n;
		}
		sum+=a;//sum應該在for循環内部加a
		System.out.println("1!+2!+3!+...+20!之和为"+sum);
	}
}
