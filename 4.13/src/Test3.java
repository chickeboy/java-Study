/*有两个正整数a和b，已知a*b=2048，求a、b各为何值时，a+b的值最小*/

public class Test3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int sum1 = 0;
		for(int a = 1;a<=2048;a++) {
			for(int b = 1;b<=2048;b++) {	
				if(a*b==2048) {
					c = sum;
					sum = a+b;
				
				if(sum<c) {
					d= a;
					e= b;
					sum1 = sum;
					
				}
				}
			}
		}
		System.out.println(sum1 +"\t"+ d+"\t"+e);
	}

}
