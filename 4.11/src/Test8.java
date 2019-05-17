/*求出1-100中所有可以被3整除的数*/

public class Test8 {
	public static void main(String[] args) {
		for(int i = 1;i<=100;i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
	}
}
