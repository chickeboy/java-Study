package hk1;

import java.util.Arrays;

/*
 * 1.要求如下：
 1）Person类自身具备比较能力（实现Comparable<T>接口），
 比较的规则是“按照姓名长度升序排序，如果长度相同，
 则按照姓名字典顺序排序”（请用英文名）。
 2）然后通过匿名内部类指定一种比较器（Comparator<T>），
 比较规则是“分数降序”。
 3）写一个测试类，创建ArrayList<Person>集合，并添加5个Person对象。
 分别用上述两种比较规则对该集合排序，检验排序结果。
 */
public class Hk1 {

	public static void main(String[] args) {
		Person[] personArray = { new Person("aa", 30), new Person("bb", 20),
				new Person("ab", 10), new Person("abc", 50),
				new Person("aa", 60) };
		Arrays.sort(personArray);
		for (Person person : personArray) {
			System.out.println(person);
		}
		System.out.println("==============");

		Arrays.sort(personArray,new CompareByScore());
		for (Person person : personArray) {
			System.out.println(person);
		}
	}

}
