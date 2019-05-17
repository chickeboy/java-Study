/*.一个整数，它加上100后是一个完全平方数，
再加上168又是一个完全平方数，请问该数是多少？*/
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1;; i++) {
			if(Math.sqrt(i+100)*10%10==0&&Math.sqrt(i+268)*10%10==0) {
				System.out.println(i);
			}
		}

	}

}
