package hk;
//2.Çó1!+2!+3!+...+20!Ö®ºÍ
public class Hk2{
     public static void main(String[] args){
  	 	long num1 = 0l;
		long num2 = 1l;
		for ( int i = 1;i <= 20;i++){
			num2 = num2 * i;
			num1 = num1 + num2;
		}
		System.out.println(num1);		
	 }
}