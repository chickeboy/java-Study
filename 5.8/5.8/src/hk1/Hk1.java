package hk1;

import java.util.ArrayList;

/*
 * 
在Arraylist中存放以下数据：
"张三","李四","王五","张三","aaa","aaa","bbb"
 要求：去除ArrayList中的重复元素。
 */
public class Hk1 {
	public static void main(String[] args) {
		String[] array = { "张三", "李四", "王五", "张三", "aaa", "aaa", "bbb" };
		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0; i < array.length; i++) {
			al.add(array[i]);
		}
		ArrayList<String> a = new ArrayList<String>();
		for (String string : al) {
			if (!a.contains(string)) {
				a.add(string);
			}
		}
		al = a;
		for (String string : al) {
			System.out.println(string);
		}
	}
}
