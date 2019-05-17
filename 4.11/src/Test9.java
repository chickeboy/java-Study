/*求出1-1000中所有即可以被3也可以被6整除的数的和
*/
public class Test9 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1;i<=1000;i++) {
			if(i%3==0&&i%6==0) {
				sum +=i;
			}
		}
		System.out.println(sum);
	}
}
