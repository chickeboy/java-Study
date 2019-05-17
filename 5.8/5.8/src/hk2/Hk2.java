package hk2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
 * 1.创建一个字符串类型的集合，用来存放学生姓名信息 题目中是否成功是否存在都要有提示
(1)编写一个方法，手动录入5条数据
(2)编写一个方法，使用普通for循环遍历集合输出
(3)编写一个方法，使用增强for循环遍历集合输出
(4)编写一个方法，使用迭代器循环遍历集合输出
(5)编写一个方法，键盘输入一个名字，查询是否存在
(6)编写一个方法，键盘输入一个名字，显示出集合中出现的该名字（比如3个张三，就打印出3个张三）
(7)编写一个方法，键盘输入一个名字，进行删除，输出是否成功（默认唯一的）
(8)编写一个方法，键盘输入一个名字，删除所有对应的名字
(9)编写一个方法，键盘输入一个名字，获取这个名字所对对应的下标(默认唯一的名字)
(10)编写一个方法，键盘输入一个名字，获取这个名字所对应的下标(默认重复的)，并且打印输出所有下标
(11)编写一个方法，创建一个集合，里面存放几条数据，将这个集合中的内容，添加到原集合中
(12)编写一个方法，创建一个集合，里面存放几条数据，删除两个集合的交集
(13)编写一个方法，创建一个集合，里面存放几条数据，获取两个集合的交集
(14)编写一个方法，通过创建一个比较器，对集合进行排序，排序规则：根据名字长度排序
(15)编写一个方法，通过匿名内部类对集合进行排序，排序规则先根据名字长度排序，长度相同比较字典顺序
(16)编写一个方法，键盘输入一个名字然后修改这个名字对应的位置的值为”abc”
(17)编写一个方法，使用al.remove方法删除键盘输入的所有的名字
(18)编写一个方法，将集合中的元素存放在数组中进行遍历输出（不要手动复制） 
 */
public class Hk2 {
	public static void main(String[] args) {
		U u = new U();
		u.init();

	}
}

class U {
	private List<String> list = new ArrayList<String>();
	private Scanner scanner = new Scanner(System.in);

	// 集合的初始化
	public void init() {
		
		while (true) {
			System.out.println("请输入");
			String name = scanner.next();
			list.add(name);
			System.out.println("请问是否继续");
			String choice = scanner.next();
			if (choice.equals("n")) {
				break;
			}
		}
	}

	// 使用普通for循环遍历集合
	public void searchByFor() {
		System.out.println("=================普通for循环遍历=================");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	// 使用增强for循环遍历集合
	public void searchByForEach() {
		System.out.println("=================增强for循环遍历=================");
		for (String string : list) {
			System.out.println(string);
		}
	}

	// 迭代器遍历
	public void searchByIterator() {
		System.out.println("=================迭代器循环遍历=================");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}

	// 查询一个名字是否存在
	public void findByName() {
		System.out.println("=================查询某个名字是否存在=================");
		System.out.println("请输入一个名字");
		String name = scanner.next();
		if (list.contains(name)) {
			System.out.println(name + "存在");
		} else {
			System.out.println("不存在");
		}
	}

	// 显示出查询的名字的具体信息
	public void findAllByName() {
		System.out.println("=================查询一个名字的所有具体信息=================");
		System.out.println("请输入");
		String name = scanner.next();
		if (list.contains(name)) {
			for (String string : list) {
				System.out.println(string);
			}
		} else {
			System.out.println("不存在");
		}
	}

	// (7)编写一个方法，键盘输入一个名字，进行删除，输出是否成功（默认唯一的）
	public void removeByOneName() {
		System.out.println("=================删除一个唯一的名字=================");
		System.out.println("请输入名字");
		String name = scanner.next();
		if (list.remove(name)) {// 删除一个
			System.out.println("删除成功");
		} else {
			System.out.println("删除失败");
		}
		searchByFor();
	}

	// (8)编写一个方法，键盘输入一个名字，删除所有对应的名字
	public void removeAllByName() {
		System.out.println("=================删除一个重复的名字=================");
		System.out.println("请输入名字");
		String name = scanner.next();
		if (list.contains(name)) {
			Iterator<String> iterator = list.iterator();
			while (iterator.hasNext()) {
				String string = (String) iterator.next();
				if (string.equals(name)) {
					iterator.remove();
				}
			}
		} else {
			System.out.println("不包含");
		}
		searchByFor();
	}

	// 查询唯一名字的下标
	public void findIndexByOneName() {
		System.out.println("=================查询唯一名字的下标=================");
		System.out.println("请输入名字");
		String name = scanner.next();
		int index = list.indexOf(name);
		if (index == -1) {
			System.out.println("没有找到");
		} else {
			System.out.println("出现的位置在" + index);
		}
	}

	// (10)编写一个方法，键盘输入一个名字，获取这个名字所对应的下标(默认重复的)，并且打印输出所有下标
	public void findIndexByAllName() {
		System.out.println("=================查询重复名字的下标=================");
		System.out.println("请输入");
		String name = scanner.next();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			if (name.equals(list.get(i))) {
				al.add(i);// 下标添加进新的集合
			}
		}
		if (al.size() == 0) {// al == null;
			System.out.println("不存在");
		} else {
			System.out.println("=============所有name叫" + name + "的信息=============");
			for (Integer integer : al) {
				System.out.println(integer);
			}
		}
	}

	// 将一个新集合的内容添加到老的集合中
	public void addArrayList() {
		System.out.println("=================添加新元素到集合中=================");
		ArrayList<String> al = new ArrayList<String>();
		al.add("1");
		al.add("3");
		list.addAll(al);// 复制al的内容到list中
		searchByFor();
	}

	// 删除集合的交集
	public void removeByNewArrayList() {
		System.out.println("=================删除集合的交集=================");
		ArrayList<String> al = new ArrayList<String>();
		al.add("1");
		al.add("3");
		if (list.removeAll(al)) {// 谁是对象就动谁
			System.out.println("删除成功");
		} else {
			System.out.println("删除失败");
		}
		searchByFor();
	}

	// 获取两个集合的交集
	public void retainArrayList() {
		System.out.println("=================获取集合的交集=================");
		ArrayList<String> al = new ArrayList<String>();
		al.add("1");
		al.add("3");
		if (list.retainAll(al)) {
			ArrayList<String> a = new ArrayList<String>();
			for (int i = 0; i < list.size(); i++) {
				if (!a.contains(list.get(i))) {
					a.add(list.get(i));
				}
			}
			list = a;
		} else {
			System.out.println("没有交集");
		}
		searchByFor();
	}

	// 根据长度排序
	public void sortByLength() {
		System.out.println("=================根据长度排序=================");
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.length() - o2.length();
			}
		});
		searchByFor();
	}

	// 根据长度，再根据名字
	public void sortByLengthAndName() {
		System.out.println("=================根据长度和字典顺序排序=================");
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1.length() == o2.length()) {
					return o1.compareTo(o2);
				}
				return o1.length() - o2.length();
			}
		});
		searchByFor();
	}

	// 查询名字出现的位置然后修改
	public void updateByName() {
		System.out.println("=================修改名字=================");
		System.out.println("请输入名字");
		String name = scanner.next();
		int index = list.indexOf(name);
		if (index == -1) {
			System.out.println("不存在");
		} else {
			list.set(index, "abc");
		}
		searchByFor();
	}

	// 使用al.remove删除某一个名字的所有信息
	public void removeAllAlByName() {
		System.out.println("=================使用al.remove删除=================");
		System.out.println("请输入名字");
		String name = scanner.next();
		while (list.remove(name))
			searchByFor();
	}

	public void changeToArray() {
//		ArrayList<String> al = new ArrayList<String>();
//		al.add("123");
//		al.add("456");
//		ArrayList<String> a = new ArrayList<String>(al);

		String[] array = new String[list.size()];
		list.toArray(array);
		for (String string : array) {
			System.out.println(string);
		}
	}
}
