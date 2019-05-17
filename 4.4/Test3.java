/*
	
*/
public class Test3{
	public static void main(String[] args){
		int a = 3;
		double b = 4.0;
		double c = a + b;
		System.out.println(a + b);
		//两种数据类型做数学运算 最后结果是较大的数据类型
		//自动提升
		double d1 = 1.0 / 3;//16位
		float  f  = 1.0f / 3;//8位
		//两个相同数据类型数学运算的结果就是这个数据类型
		//整数除以整数如果结果有小数点的话，结果会精度损失
		//只保留整数部分
		System.out.println(d1);
		System.out.println(f);
		//System.out.println(1 / 0.0);
	}
}