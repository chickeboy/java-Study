package hk3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hk3 {
	/*
	 * 3.创建Student类，包含String类型的name，
	 * int类型的age，double类型的score，
	 * 并重写getter、setter等方法。
	 * 2）创建5个Student对象。
	 * 已知一个Integer类型的学号对应唯一的一个Student对象 3）
	 * 将5个Student对象保存到HashMap容器中。
	 * 4）遍历该容器，打印出来。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Student> hashMap = new HashMap<Integer, Student>();
		hashMap.put(1, new Student("张三",34,38.1));
		hashMap.put(2, new Student("李四",24,38.1));
		hashMap.put(3, new Student("王五",15,38.1));
		hashMap.put(4, new Student("赵六",25,38.1));
		hashMap.put(5, new Student("张三",34,38.1));
		Set<Entry<Integer,Student>> entrySet = hashMap.entrySet();
		for (Entry<Integer, Student> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println("====================================");
		}
	}

}
