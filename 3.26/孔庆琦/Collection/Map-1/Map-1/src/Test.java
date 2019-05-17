import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

public class Test {
	public static void main(String[] args) {
		// 1.生成50个随机数
		Random random = new Random();
		int[] array = new int[50];
		for (int i = 0; i < array.length; i++) {
			array[i] = 30 + random.nextInt(6);
		}
		// 2.将自己的比较规则传入map中
		int maxNum = 0;
		int maxCount = 0;
		TreeMap<Integer, Integer> map = new TreeMap<>(new MyCompare());
		for (int i = 0; i < array.length; i++) {// 这里的array[i]出现的数字，也就是key的值
			if (map.containsKey(array[i])) {
				map.put(array[i], map.get(array[i]) + 1);// 这里遇到重复的key那么就获取原先对应的值然后+1再覆盖整个key对应的值
			} else {
				map.put(array[i], 1);// 第一次出现就是1次
			}
			if (maxCount < map.get(array[i])) {
				maxNum = array[i];
				maxCount = map.get(array[i]);
			}
		}
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		for (Entry<Integer, Integer> en : entrySet) {
			System.out.println("数字:" + en.getKey() + "...................出现了" + en.getValue() + "次");
		}
		System.out.println("===========================================");
		System.out.println("出现次数最多的数字是............ " + maxNum + "出现了...................." + maxCount);
	}
}
