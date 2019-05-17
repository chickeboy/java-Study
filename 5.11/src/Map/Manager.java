package Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Manager {
	HashMap<Integer, Book> hashMap;

	public Manager(HashMap<Integer, Book> hashMap) {
		super();
		this.hashMap = hashMap;
	}

	public HashMap<Integer, Book> add() {
		hashMap.put(1, new Book("aa", "a", 30));
		hashMap.put(1, new Book("cca", "c", 18));
		hashMap.put(2, new Book("bbc", "a", 24));
		hashMap.put(4, new Book("ca", "a", 23));
		hashMap.put(3, new Book("aabb", "b", 43));
		hashMap.put(7, new Book("cab", "b", 16));
		hashMap.put(5, new Book("ccaa", "c", 3));
		hashMap.put(6, new Book("abcdf", "d", 24));
		return hashMap;
	}

	public HashMap<Integer, Book> findbyid1() {
		System.out.println("请输入要查找的id");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		HashMap<Integer, Book> hashMap2 = new HashMap<Integer, Book>();
		hashMap2.putAll(findById(id));
		return hashMap2;
	}

	public HashMap<Integer, Book> findByName() {
		System.out.println("请输入要查找的name");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		HashMap<Integer, Book> hashMap2 = new HashMap<Integer, Book>();
		hashMap2.putAll(findByName(name));
		return hashMap2;
	}

	public List<Entry<Integer, Book>> showByTop() {
		TreeMap<Integer, Book> treeMap = new TreeMap<Integer, Book>();
		treeMap.putAll(hashMap);
		HashMap<Integer, Book> hashMap2 = new HashMap<Integer, Book>();
		List<Entry<Integer, Book>> list = new ArrayList<Entry<Integer, Book>>(treeMap.entrySet());
		Collections.sort(list, new Comparator<Entry<Integer, Book>>() {
			@Override
			public int compare(Entry<Integer, Book> o1, Entry<Integer, Book> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().getCount() - o1.getValue().getCount();
			}
		});
		return list;
	}

	public HashMap<Integer, Book> removeByid() {
		HashMap<Integer, Book> hashMap2 = new HashMap<Integer, Book>();
		hashMap2.putAll(hashMap);
		System.out.println("请输入要删除的书籍id");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		Set<Entry<Integer, Book>> entrySet = findById(id).entrySet();
		Iterator<Entry<Integer, Book>> iterator = entrySet.iterator();
		Entry<Integer, Book> entry = iterator.next();
		hashMap2.remove(entry.getKey(), entry.getValue());
		return hashMap2;
	}

	public HashMap<Integer, Book> removeByType() {
		HashMap<Integer, Book> hashMap2 = new HashMap<Integer, Book>();
		hashMap2.putAll(hashMap);
		System.out.println("请输入要删除的type");
		Scanner scanner = new Scanner(System.in);
		String type = scanner.next();
		Set<Entry<Integer, Book>> entrySet = findByType(type).entrySet();
		for (Entry<Integer, Book> entry : entrySet) {
			hashMap2.remove(entry.getKey(), entry.getValue());
		}
		return hashMap2;
	}

	public HashMap<Integer, Book> modifyByid() {
		System.out.println("请输入要修改的id");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		Set<Entry<Integer, Book>> entrySet = findById(id).entrySet();
		Iterator<Entry<Integer, Book>> iterator = entrySet.iterator();
		Entry<Integer, Book> entry = iterator.next();
		System.out.println("请输入要修改的count");
		int count = scanner.nextInt();
		entry.getValue().setCount(count);
		return hashMap;
	}

	public void sum() {
		int sum = 0;
		Set<Entry<Integer, Book>> entrySet = hashMap.entrySet();
		for (Entry<Integer, Book> entry : entrySet) {
			sum += entry.getValue().getCount();
		}
		System.out.println("书籍总数为：" + sum);
	}

	public HashMap<Integer, Book> removeByAll() {
		HashMap<Integer, Book> hashMap2 = new HashMap<Integer, Book>();
		hashMap2.putAll(hashMap);
		System.out.println("请输入要删除的type");
		Scanner scanner = new Scanner(System.in);
		String type = scanner.next();
		Util util = new Util();
		util.show(findByType(type));
		System.out.println("请输入要删除的id");
		int id = scanner.nextInt();
		Set<Entry<Integer, Book>> entrySet = findById(id).entrySet();
		Iterator<Entry<Integer, Book>> iterator = entrySet.iterator();
		Entry<Integer, Book> entry = iterator.next();
		hashMap2.remove(entry.getKey(), entry.getValue());
		return hashMap2;
	}

	public List<Entry<Integer, Book>> compareByName() {
		ArrayList<Entry<Integer, Book>> arrayList = new ArrayList<Entry<Integer, Book>>(hashMap.entrySet());
		Collections.sort(arrayList,new Comparator<Entry<Integer, Book>>() {

			@Override
			public int compare(Entry<Integer, Book> o1, Entry<Integer, Book> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().getName().compareTo(o1.getValue().getName());
			}
		});
		return arrayList;
	}
	public List<Entry<Integer, Book>> compareByCount() {
		ArrayList<Entry<Integer, Book>> arrayList = new ArrayList<Entry<Integer,Book>>(hashMap.entrySet());
		Collections.sort(arrayList,new Comparator<Entry<Integer, Book>>() {

			@Override
			public int compare(Entry<Integer, Book> o1, Entry<Integer, Book> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().getCount()-o2.getValue().getCount();
			}
		});
		return arrayList;
	}
	public List<Entry<Integer, Book>> compareByAll() {
		ArrayList<Entry<Integer, Book>> arrayList = new ArrayList<Entry<Integer,Book>>(hashMap.entrySet());
		ComepareByAll comepareByAll = new ComepareByAll();
		Collections.sort(arrayList,comepareByAll);
		return arrayList;
	}
	public HashMap<Integer, Book> findById(int id) {
		HashMap<Integer, Book> hashMap2 = new HashMap<Integer, Book>();
		Set<Entry<Integer, Book>> entrySet = hashMap.entrySet();
		for (Entry<Integer, Book> entry : entrySet) {
			if (entry.getKey() == id) {
				hashMap2.put(entry.getKey(), entry.getValue());
			}
		}
		return hashMap2;
	}
	public HashMap<Integer, Book> findByName(String name) {
		HashMap<Integer, Book> hashMap2 = new HashMap<Integer, Book>();
		Set<Entry<Integer, Book>> entrySet = hashMap.entrySet();
		for (Entry<Integer, Book> entry : entrySet) {
			if (entry.getValue().getName().equals(name)) {
				hashMap2.put(entry.getKey(), entry.getValue());
			}
		}
		return hashMap2;
	}

	public HashMap<Integer, Book> findByType(String type) {
		HashMap<Integer, Book> hashMap2 = new HashMap<Integer, Book>();
		Set<Entry<Integer, Book>> entrySet = hashMap.entrySet();
		for (Entry<Integer, Book> entry : entrySet) {
			if (entry.getValue().getType().equals(type)) {
				hashMap2.put(entry.getKey(), entry.getValue());
			}
		}
		return hashMap2;
	}
}
