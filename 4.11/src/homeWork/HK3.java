/*Çó1!+5!+9!+...+21!Ö®ºÍ*/
package homeWork;

public class HK3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 1;
		double sum = 0;
		for(int i=1;i<=21;i+=4) {
			a=1;
			for(int j=1;j<=i;j++) {
				a=a*j;
			}
			sum = sum+a;
		}
		System.out.println(sum);
		
	}
}
