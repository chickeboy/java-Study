public class Test5{
	public static void main(String[] args){
		int a = 3;
		int b = 5;
		double c = 1.0 * a / b;
		double c =  a / b * 1.0;
		//2个相同数据类型做数学操作，最后的结果就是这个数据类型
		System.out.println(c);
		//2个不同的数据类型做数学运算，最后的结果
		//是精度较高的数据类型
	}
}