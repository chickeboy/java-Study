/*求1+1/3+1/5+...的前20项之和。*/
public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 1.0;
		double a = 3.0;
		for(int i =1;i<20;i++) {
			sum = sum+1/a;
			a+=2;
		}
		System.out.println(sum);
	}

}
