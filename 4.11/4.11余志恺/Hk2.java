package hk;
//2.	求1!+2!+3!+...+20!之和。

public class Hk2{
	public static void main(String[] args){
		double sum = 0;
		double sum1 = 1;
		for (int i = 1;i<21;i++){
			sum1 *= i;	
			sum += sum1;
		}
		System.out.println("1!+2!+3!+...+20!的和为"+sum);
}
}