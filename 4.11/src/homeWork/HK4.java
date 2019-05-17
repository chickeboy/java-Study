/*求a+aa+aaa+...（如2+22+222+2222+22222）前n项之和*/
package homeWork;

public class HK4 {
	public static void main(String[] args) {
		int n = 3;
		double sum = 0;
		int a=2;
		double b = 0;
		for(int i = 0;i<n;i++) {
			b = b+a*Math.pow(10, i);		
			sum = sum + b;
		}
		System.out.println(sum);
	}
}
