package tk;

public class Tk3 {
	public static void main(String[] args) {
		// 数组之间如何赋值
		int[] array1 = new int[] { 1, 2, 3 };
		int[] array2 = new int[] { 2, 4, 1 };
		System.out.println(array1);
		System.out.println(array2);
		int a = 3;
		int b = 4;
		a = b;
		array1 = array2;
		System.out.println(array1);
		System.out.println(array2);
		array1[1] = 100000;
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		System.out.println("===============");
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);

		}
		// 多个引用变量指向同一块内存大家都有这块
		// 内存的操作权限，一个变量操作了内存
		// 其他变量再次访问的时候内存中的值也发生变化

	}
}
