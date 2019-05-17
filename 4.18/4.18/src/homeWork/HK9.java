package homeWork;
/*编写求k!的方法，再调用该函数求1!+2！+3！+....10!之和并输出*/
public class HK9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 10;
		double sum = 0;
		for(int i = 1;i<=k;i++) {		
			sum = sum+factorial(i);
		}
		System.out.println(sum);
	}
	public static double factorial(int k) {
		int b=1;
		for(int i = 1;i<=k;i++) {
			b = b*i;
		}
		return b;
	}

}
