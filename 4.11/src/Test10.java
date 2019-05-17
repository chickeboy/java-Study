/*求出从1开始所有的可以被17整除的数，打印10个*/

public class Test10 {
	public static void main(String[] args) {
		int j=1;
		int i=1;
		do{		
			i++;
			if(i%17==0) {
				System.out.println(i);
				j++;
			}
		}while(j<=10);
	}
}
