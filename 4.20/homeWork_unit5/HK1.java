//编写求k!的方法，再调用该函数求10!并输出
public class HK1{
	public static void main(String[] args){
		
		System.out.println(factorial(10));
	}
	public static double  factorial(int a){
		double b = 1;
		for(int i = 1;i<=a;i++){
			b = b*i;
		}
		return b;
	}
}