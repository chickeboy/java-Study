import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class setdemo {
	/*
	 * 1.创建一个HashSet 存放字符串， 
	 * (1)循环录入5条数据，重复数据无法添加，给予提示 
	 * (2)键盘输入一个字符串，删除这个字符串，给予提示
	 * (3)键盘输入一个字符串，查询该字符串是否存在于集合中 
	 * (4)编写2种方式遍历集合 
	 * (5)通过2种方式删除一个字符串
	 * (6)创建一个Integer类型的ArrayList，存入30个0-10的随机数，然后使用HashSet将集合中重复的元素取出遍历输出结果
	 * (7)对HashSet进行排序，根据String的自然顺序
	 */
	public static void main(String[] args) {
		String string;
		Set<String> set = new HashSet<String>();
		Scanner  scanner  = new Scanner(System.in);
		set.add("aa");
		set.add("bb");
		/*
		 * for (int i = 0; i < 5; i++) { System.out.println("请输入"); string =
		 * scanner.next(); if (set.add(string)) { System.out.println("存入成功"); }else {
		 * System.out.println("存入失败"); i--; } }
		 */
		System.out.println("请输入要删除的字符");
		//string = scanner.next();
		string = "bb";
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			String string1 = (String) iterator.next();
			if (string1.equals(string)) {
				iterator.remove();
				System.out.println("删除成功");
			}else {
				System.out.println("删除失败");
			}
		}
		System.out.println(set.remove(string));
		System.out.println("请输入要查找的字符");
		//string = scanner.next();
		string  = "aa";
		if (set.contains(string)) {
			System.out.println("能够找到");
		} else {
			System.out.println("不能找到");
		}
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			String string2 = (String) iterator.next();
			System.out.println(string2);
		}
		for (String string2 : set) {
			System.out.println(string2);
		}
		List<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			arrayList.add((int)Math.floor(Math.random()*10));
		}
		for (Integer integer : arrayList) {
			System.out.println(integer);
		}
		System.out.println("==================");
		Set<Integer> set2= new HashSet<Integer>();
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			if (set2.add(integer)) {
				iterator.remove();
			}
		}
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
	}
}
