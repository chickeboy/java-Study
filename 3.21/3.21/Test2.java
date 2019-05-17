/*
	字符串的拼接
*/
public class Test2{
	public static void main(String[] args){
		System.out.println("1 + 2");//字符串里面写的是什么
		//最后输出的结果就是什么
		System.out.println(1 + 2);
		System.out.println("1" + 2);//"12"
		//字符串和其他数据做+,不是数学运算,拼接符
		//字符串会把其他数据类型吸收，也变成字符串
		System.out.println("我的年龄是...25");
		System.out.println("我的年龄是..." + 25);
		System.out.println("3123 + 5123 = " + (3123 + 5123));
		//"3123 + 5123 =  3123" + 5123 
		//""
	}
}