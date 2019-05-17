package hk;
//3.Çó1!+5!+9!+...+21!Ö®ºÍ¡£
public class Hk3{
     public static void main(String[] args){
  	 	double num1 = 0;
		double num2 = 1;
		for ( int i = 1;i <= 21;i++){
			num2 = num2 * i;
			if ( (i-1) % 4==0){
				num1 = num1 + num2;
			}
		}
		System.out.println(num1);		
	 }
}