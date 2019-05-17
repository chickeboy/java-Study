package tk3;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayList的查询和遍历
 */
public class Tk4 {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println(al.get(0));// 通过下标获取位置上的元素
		System.out.println(al.indexOf(0));// 通过元素值获取它第一次出现的位置的下标
		System.out.println(al.contains(4));// 查询一个元素实在存在于集合中
		System.out.println(al.remove(new Integer(5)));
		// 集合的遍历
		System.out.println(al);
		// 1.普通for循环
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		// 2.for each
		for (Integer integer : al) {
			System.out.println(integer);
		}
		// 3.迭代器模式 所有的iterable接口的实现类都会有iterator()方法
		// 类似于返回容器内部的一个指针
		System.out.println("===================");
		Iterator<Integer> it = al.iterator();
		while (it.hasNext()) {// 是否下一个位置有元素
//			System.out.println(it.next());// 迭代器获取下一个元素
//			if (it.next().equals(new Integer(4))) {
//				it.remove();
//			}
			Integer integer = it.next();
			System.out.println(integer);
//			if (integer.equals(new Integer(4))) {
//				it.remove();
//			}
		}
		System.out.println("===================");
		// 迭代器需要重置
		it = al.iterator();// 重新获取首地址
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
