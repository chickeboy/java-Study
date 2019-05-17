package tk3;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*
 * 集合框架
 * List  Set  Map
 * 通过各种数据结构，对数据进行存储
 * Iterable 接口：迭代器接口，所有它的子类都具有
 * iterator()方法 可以使用for each循环
 * Collection子接口
 * List 有序集合（序列）的父接口
 * 该接口下的实现类容器实现内存地址连续，具有下标（索引）
 * 可以通过具体下标位置操作容器中的数据
 * 可以存放重复数据
 * List - > ArrayList是List的实现类
 * ArrayList:底层结构为数组，其实就是对数组的一个封装和功能提升
 *  程序员不再需要操作底层数组
 * 
 * 
 * 
 * 0  1  3
 */
public class Tk3 {
	public static void main(String[] args) {
		// 创建一个存放String类型的List集合容器
		ArrayList<String> al = new ArrayList<String>();
		// 1.添加数据 实现的是尾插法
		al.add("a");
		al.add("b");
		al.add("a");
		System.out.println(al.size());// size()表示的是实际元素个数
		al.add(0, "a");// 这个指定下标不是无条件的，必须是和尾部连续的下标值或者在尾部之前的位置
		System.out.println(al);// 直接打印集合变量，并不是遍历
		System.out.println(al.remove(2));// 通过下标删除，返回这个位置被删除的具体元素值
		System.out.println(al.remove("a"));// 原理是根据存入对象类型的equals方法
		System.out.println(al);
		al.set(0, "zzzzzzzzz");
		System.out.println(al);
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(3);
		System.out.println(a.remove(new Integer(3)));
	}
}
