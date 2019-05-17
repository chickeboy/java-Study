
package hk;

//2.Çó1!+2!+3!+...+20!Ö®ºÍ¡£
public class Hk2 {
	public static void main(String[] args) {
		double sum = 1;
		double sum2 = 0;
		for (int a = 1; a <= 20; a++) {
			sum = sum * a;
			sum2 = sum2 + sum;
		}
		System.out.println(sum2);
	}
}
