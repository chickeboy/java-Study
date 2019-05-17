package tk;

/*
 * 数组:存储数据的容器
 * 特点:存储空间地址是连续的,所以它拥有下标（索引）
 * 因为了有了下标，就可以完成随机访问，我通过下标
 * 直接可以访问到对应的位置上存储的数据，不需要通过线性遍历
 * 数组是静态的，数组的长度一旦创建无法改变,所以每个位置都是
 * 固定的
 * 只能存放同一数据类型，一旦在声明定义的时候确定了数据类型
 * 不能改变
 */
public class Tk1 {
	public static void main(String[] args) {
		// 语法 数据类型[] 数组名 = {1,2,4,5} 静态初始化
		// 静态初始化:在定义的时候确定了数组的长度的同时
		// 也给予了赋值
		int[] array = { 1, 2, 4, 5 };// 存放整数型的容器
		// 数组的长度为 4 最后一位是 3 数组的最后一位就是长度 -1
		// 动态初始化,具体的值要根据程序的运行来确定
		// 数组在动态初始化的时候必须赋予长度
		int[] array2 = new int[10];
		System.out.println(array2.length);
		// array2.length只能表示数组的长度 不能代表数组中有几个元素
		// 数组如果是动态初始化的话，里面就算没有赋值，也会有默认值
		// int 0 String null double 0.0 boolean false char \u0000
		// 数组的遍历，从0号位开始循环通过下标访问数组中每一个位置
		String[] ct = new String[5];
		for (int i = 0; i < ct.length; i++) {
			System.out.println(ct[i]);// ct数组上i号位存的值
		}
	}
}
