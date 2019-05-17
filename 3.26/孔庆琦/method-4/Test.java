/*
分别封装2个方法，求fibonacci数列第n个数。【1,1,2,3,5,8,13,21...】
要求使用两种方法：①循环 ②数组

*/
public class Test{
	public static void main(String[] args){
		System.out.println("第9个数是......" + getByFor(9));
		System.out.println("第9个数是......" + getByArray(9));
	}

	public static int getByFor(int n){
		int a = 1;
		int b = 1;
		int c = 0;
		for(int i = 2;i < n ;i ++){
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}
	//数组获取对应的结果
	public static int getByArray(int n){
		int[] array = new int[n];//n其实就是数组的长度
		array[0] = 1;
		array[1] = 1;//给前两项赋值
		for(int i = 2; i < array.length;i++){//前两项省略，因为已经赋值过了，下标从2开始即可
			array[i] = array[i - 1] + array[i - 2];
		}
		return array[array.length-1];
	}
}