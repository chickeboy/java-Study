//��д��k!�ķ������ٵ��øú�����1!+2��+3��+....10!֮�Ͳ����;
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