//编写求k!的方法，再调用该函数求1!+2！+3！+....10!之和并输出;
public class HK2{
	public static void main(String[] args){
		double sum = 0;
		for(int i =1;i<=10;i++){
			sum = sum +factorial(i);
		}
		System.out.println(sum);	
	}
	public static double factorial(int a){
		double b = 1;
		for(int i=1;i<=a;i++){
			b*=i;
		}
		return b;
	}
}