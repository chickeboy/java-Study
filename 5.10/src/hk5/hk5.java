package hk5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

/*请根据题目描述完成代码
1）创建Student类，包含String类型的name，int类型的age，double类型的score，并重写getter、setter等方法。
2）创建5个Student对象。已知一个Integer类型的学号对应唯一的一个Student对象。
3）将5个Student对象保存到HashMap容器中。
4）请对该集合中的元素按照分数降序排序（提示：可以转存其他容器）
5）将排序后的结果输出，格式：4-lanying-18-90.0*/
public class hk5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Student> hashMap = new HashMap<Integer, Student>();
		hashMap.put(1, new Student("zhangsan", 17, 85.2));
		hashMap.put(2, new Student("lisi", 17, 76.9));
		hashMap.put(3, new Student("wangwu", 17, 78.4));
		hashMap.put(4, new Student("sdasda", 17, 99.0));
		hashMap.put(5, new Student("fadfsdgfsg", 17, 68.4));
		List<Entry<Integer,Student>> list = new ArrayList<Entry<Integer,Student>>(hashMap.entrySet());
		Collections.sort(list,new Comparator<Entry<Integer,Student>>() {
			@Override
			public int compare(Entry<Integer, Student> o1, Entry<Integer, Student> o2) {
				// TODO Auto-generated method stub
				if (o2.getValue().getScore()>o1.getValue().getScore()) {
					return 1;
				} else {
					return -1;
				}
				
			}
		});
		for (Entry<Integer, Student> entry : list) {
			System.out.print(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

}
