/*求12+32+52+...+992之和。(注意2是指数)*/

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		for(int i = 1;i<=99;i+=2) {
			sum = sum+Math.pow(i, 2);
		}
		System.out.println(sum);
	}

}
