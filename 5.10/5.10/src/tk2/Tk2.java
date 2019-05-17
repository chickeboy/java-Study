package tk2;

import java.util.HashMap;
import java.util.Map;

/*
 * Map 严格意义上不是集合
 *  完成了一个Key - value的关系
 *  一个key对应一个值，key是唯一的  value可以被覆盖
 *map 无序  有去重功能只针对key
 *  
 */
public class Tk2 {
	public static void main(String[] args) {
		// Map的两个实现类 HashMap TreeMap
		Map<Integer, String> map = new HashMap<Integer, String>();
		// map的添加
//		System.out.println(map.put(null, null));
//		System.out.println(map.put(null, "hehe"));
		// map的key支持为null
		System.out.println(map.put(1, "aa"));
		// 如果出现添加重复的key返回值会返回被你这个key原来存在覆盖的那个key上对应的value
		System.out.println(map.put(1, "cc"));
		System.out.println(map.put(3, "cc"));
		System.out.println(map);
		// 获取key 获取 value 不同key 的value是可以重复的
		System.out.println(map.get(3));
		// 查询map中是否有某一个key
		System.out.println(map.containsKey(3));
		// 查询map中是否有一个value
		System.out.println(map.containsValue("ccc"));
		// 返回的是这个key上对应的value
		System.out.println(map.remove(1));
		System.out.println(map.remove(3, "cc"));// boolean
		
	}
}
