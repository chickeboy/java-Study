/*
编写求k!的方法，再调用该方法求1!+2！+3！+....10!之和并输出。
*/
public class Test{
	public static void main(String[] args){
		//System.out.println(getOne(4));
		double sum = getSum(10);
		System.out.println("最后的结果是     " + sum);
	}
	//求每个数的阶乘的逻辑是一样的，我们应该将这个逻辑单独写成一个方法，方便多次使用
	public static double getOne(int k){
		double sum = 1;//必须给1
		for(int i = 1;i <= k; i++){
			sum *= i;
		}
		return sum;
	}
	public static double getSum(int n){//n代表的是求和到几
		double sum = 0;
		for(int i = 1;i <=n;i++){
			double num = getOne(i);
			System.out.println(i + "它的阶乘是..............." + num);
			sum +=num;
		}
		return sum;
	}
}