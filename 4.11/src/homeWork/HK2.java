/*Çó1!+2!+3!+...+20!Ö®ºÍ*/
package homeWork;

public class HK2 {
	public static void main(String[] args) {
		double sum = 0;
		double a;
		for(int i=1;i<=20;i++) {
			a=1;
			for(int j=1;j<=i;j++) {
				a=a*j;
			}
			sum = sum+a;
		}
		System.out.println(sum);
	}
}
