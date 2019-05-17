/*求20+21+22+...+263之和(注意是2的次幂)
*/
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 1;
		for(int i =1;i<=63;i++) {
			a = a+Math.pow(2,i);
		}
		System.out.println(a);
	}

}
