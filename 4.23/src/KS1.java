
public class KS1 {
	public static void main(String[] args) {
		double a =  100;
		double sum = 0;
		for(int i =0;i<5;i++) {
			sum = sum + a*2;
			a = a/2;
		}
		System.out.println(a +"\t"+ (sum-100));
	}
}
