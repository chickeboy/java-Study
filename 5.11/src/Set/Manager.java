package Set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Manager {
	HashSet<Book> hashSet;

	public Manager(HashSet<Book> hashSet) {
		super();
		this.hashSet = hashSet;
	}

	public HashSet<Book> add() {
		hashSet.add(new Book(1, "aa", "a", 30));
		hashSet.add(new Book(1, "cca", "c", 18));
		hashSet.add(new Book(3, "bbc", "a", 24));
		hashSet.add(new Book(2, "ca", "a", 23));
		hashSet.add(new Book(7, "aabb", "b", 43));
		hashSet.add(new Book(4, "cab", "b", 16));
		hashSet.add(new Book(6, "ccaa", "c", 3));
		hashSet.add(new Book(7, "abcdf", "d", 24));
		return hashSet;
	}

	public HashSet<Book> findbyidA() {
		System.out.println("请输入要查找的书本id");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		HashSet<Book> hashSet2 = findById(id);
		return hashSet2;

	}

	public HashSet<Book> findByNamea() {
		System.out.println("请输入要查找的书籍name");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		HashSet<Book> hashSet2 = findByName(name);
		return hashSet2;

	}

	public HashSet<Book> findById(int id) {
		HashSet<Book> hashSet2 = new HashSet<Book>();
		for (Book book : hashSet) {
			if (book.getId() == id) {
				hashSet2.add(book);
			}
		}
		return hashSet2;
	}

	public HashSet<Book> findByName(String name) {
		HashSet<Book> hashSet2 = new HashSet<Book>();
		for (Book book : hashSet) {
			if (book.getName().equals(name)) {
				hashSet2.add(book);
			}
		}
		return hashSet2;
	}
	public HashSet<Book> findByType(String type) {
		HashSet<Book> hashSet2 = new HashSet<Book>();
		for (Book book : hashSet) {
			if (book.getType().equals(type)) {
				hashSet2.add(book);
			}
		}
		return hashSet2;
	}
	public TreeSet<Book> showTop() {	
		TreeSet<Book> treeSet = new TreeSet<Book>();
		treeSet.addAll(hashSet);
		TreeSet<Book> treeSet2 = new TreeSet<Book>();
		Iterator<Book> iterator = treeSet.iterator();
		for (int i = 0; i < 5; i++) {
			iterator.hasNext();
			treeSet2.add(iterator.next());
		}
		return treeSet2;	
	}
	public HashSet<Book> removeById() {
		HashSet<Book> hashSet2 = new HashSet<Book>();
		hashSet2.addAll(hashSet);		
		System.out.println("请输入要删除的书本id");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		hashSet2.removeAll(findById(id));
		return hashSet2;	
	}
	public HashSet<Book> removeByType() {
		HashSet<Book> hashSet2 = new HashSet<Book>();
		hashSet2.addAll(hashSet);
		System.out.println("请输入你要删除的type");
		Scanner scanner = new Scanner(System.in);
		String type = scanner.next();
		hashSet2.removeAll(findByType(type));
		return hashSet2;
	}
	public HashSet<Book> modify() {
		System.out.println("请输入你要修改的id");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		HashSet<Book> hashSet2 = findById(id);
		System.out.println("请输入要修改的count");
		int count = scanner.nextInt();
		Iterator<Book> iterator = hashSet2.iterator();
		for (Book book : hashSet2) {
			book.setCount(count);
		}
		return hashSet;
	}
	public void sumBooks() {
		int sum = 0;
		for (Book book : hashSet) {
			sum+=book.getCount();
		}
		System.out.println("书本的总和为:"+sum);
		System.out.println("=============================");
	}
	public HashSet<Book> removeByType1() {
		HashSet<Book> hashSet2 = new HashSet<Book>();
		hashSet2.addAll(hashSet);
		System.out.println("请输入type");
		Scanner scanner = new Scanner(System.in);
		String type =scanner.next();
		Util util = new Util();
		util.show(findByType(type));
		System.out.println("请输入要删除的书籍id");
		int id = scanner.nextInt();
		for (Iterator<Book> iterator = hashSet2.iterator(); iterator.hasNext();) {
			Book book = (Book) iterator.next();
			if (book.getId()==id) {
				iterator.remove();
			}
		}
		return hashSet2;
	}
	public HashSet<Book> compareById() {
		HashSet<Book> hashSet2 = new HashSet<Book>();
		hashSet2.addAll(hashSet);
		return hashSet2;
	}
	public TreeSet<Book> compareByname() {
		CompareByName compareByName = new CompareByName();
		TreeSet<Book> treeSet = new TreeSet<Book>(compareByName);
		treeSet.addAll(hashSet);
		return treeSet;
	}
	public TreeSet<Book> compareByCount() {
		TreeSet<Book> treeSet = new TreeSet<Book>(new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				// TODO Auto-generated method stub
				return o1.getCount()-o2.getCount();
			}
		});
		treeSet.addAll(hashSet);
		return treeSet;
 	}
	public TreeSet<Book> compareByAll() {
		CompareByAll compareByAll = new CompareByAll();
		TreeSet<Book> treeSet = new TreeSet<Book>(compareByAll);
		treeSet.addAll(hashSet);
		return treeSet;
	}
}
