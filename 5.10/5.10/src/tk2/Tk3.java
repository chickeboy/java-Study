package tk2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

//如何遍历Map Map没有继承Iterable接口,导致没有迭代器
//也就无法使用for each
public class Tk3 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(4, "ff");
		hm.put(2, "xx");
		hm.put(3, "zz");
		hm.put(1, "ee");
		hm.put(5, "aa");
//		Set<Integer> set = new HashSet<Integer>(hm.keySet());
//		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
//			Integer integer = (Integer) iterator.next();
//			hm.remove(integer);
//		}
		// 1.keySet() 将Map中的所有key存在Set集合中返回
		Set<Integer> keySet = hm.keySet();
		for (Integer integer : keySet) {
			System.out.println("key......" + integer);
			System.out.println("value......" + hm.get(integer));
		}
		// 2.迭代器
		System.out.println("=============================");
		Iterator<Integer> it = keySet.iterator();
		while (it.hasNext()) {
			Integer integer = (Integer) it.next();// key
			// it.remove();
			System.out.println("key......" + integer);
			System.out.println("value......" + hm.get(integer));
		}
		System.out.println(hm);
		// 3.使用entrySet访问 将key和value一起打包装出
		Set<Entry<Integer, String>> entrySet = hm.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

	}
}
