public class Test2{
	public static void main(String[] args){
		int a = 0 ;
		int b = 1 ; 
		int sum ;
		for(int i=3;i<=13;i++){
			// 1 1 2 3 5 8 13 21 34
			sum = a + b;
			System.out.println(sum);
			a=b;
			b=sum;
		}
	}
}