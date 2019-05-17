/*
 * 数组:存放同一数据类型的有序容器
 * 有序:内存地址是连续的,所以数组具有一个特征:下标，索引
 * 创建一个数组，长度由用户确定，字符串数组
 * 然后手动添加数组中的内容，字符串长度超过3不能存入
 * 遍历输出整个数组
 */
public class Test1 {
	public static void main(String[] args) {
		// 数组使用过的语法,静态初始化,创建数组的同时，也确定了其中的具体值
		int[] array = { 2, 3, 4, 5, 1 };
		// 数组的动态初始化
		int[] array2 = new int[5];// 这里只是申请空间，并没有赋值
		// 数组的初始长度必须赋值，而且一旦确定长度，无法改变
		// 数组的遍历
		 System.out.println(array);
		// 通过数组的下标，能够直接访问到数组中的某个位置
		// 这个方式叫做随机访问
		System.out.println(array[3]);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
