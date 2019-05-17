package tk;

import java.util.Arrays;

/*
 * 数组的拷贝
 */
public class Tk4 {
	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 1, 5, 3 };
		// 数组长度一致没有问题
		for (int i = 0; i < array2.length; i++) {
			array2[i] = array1[i];
			// 左 ：array2的i号位 右:array1的i号位上存的值
		}
//		int[] a1 = { 1, 2, 4, 2 };
//		int[] a2 = new int[3];
//		for (int i = 0; i < a1.length; i++) {
//			a2[i] = a1[i];
//		}
		// Arrays类专门提供操作数组的一系列简便方法
		int[] array3 = null;// 引用数据类型的初始值都是null
		//System.out.println(array3[2]);
		System.out.println(array3);
		// NULL表示的是这个变量在堆内存中没有任何指向内存
		array3 = Arrays.copyOf(array1, array1.length);
		// Arrays.copyOf 先new 了一个数组空间 长度为 array1.length
		// 然后通过array1 的地址找到堆内存中存的数据然后赋值到这个
		// 新的内存中，然后返回这块内存的引用地址 给我们自己声明的变量
		// array3
	}
}
