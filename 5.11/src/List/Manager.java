package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Manager {
	ArrayList<Book> arrayList;

	public Manager(ArrayList<Book> arrayList) {
		super();
		this.arrayList = arrayList;
	}

	public void add() {
		arrayList.add(new Book(1, "aa", "a", 30));
		arrayList.add(new Book(1, "cca", "c", 18));
		arrayList.add(new Book(2, "bbc", "a", 24));
		arrayList.add(new Book(3, "ca", "a", 23));
		arrayList.add(new Book(4, "aabb", "b", 43));
		arrayList.add(new Book(5, "cab", "b", 16));
		arrayList.add(new Book(6, "ccaa", "c", 3));
		arrayList.add(new Book(7, "abcdf", "d", 24));
	}

	public LinkedList<Book> dealWith() {
		LinkedList<Book> linkedList = new LinkedList<Book>();
		for (int i = 0; i < arrayList.size(); i++) {
			if (!linkedList.contains(arrayList.get(i))) {
				linkedList.add(arrayList.get(i));
			}
		}
		return linkedList;
	}

	public Book findbyid() {
		System.out.println("请输入你要查找的书本");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getId() == id) {
				return arrayList.get(i);
			}
		}
		return null;
	}

	public Book findbyname() {
		System.out.println("请输入你要查找的书本name");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getName().equals(name)) {
				return arrayList.get(i);
			}
		}
		return null;
	}

	public ArrayList<Book> count() {
		List<Book> list = arrayList;
		Collections.sort(list);
		ArrayList<Book> arrayList2 = new ArrayList<Book>();
		for (int i = 0; i < 5; i++) {
			arrayList2.add(list.get(i));
		}
		return arrayList2;
	}

	public ArrayList<Book> removebyid() {
		ArrayList<Book> arrayList2 = arrayList;
		System.out.println("请输入要删除的书籍id");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		for (Iterator<Book> iterator = arrayList2.iterator(); iterator.hasNext();) {
			Book book = (Book) iterator.next();
			if (book.getId() == id) {
				iterator.remove();
			}
		}
		return arrayList2;
	}

	public ArrayList<Book> removeByCount() {
		ArrayList<Book> arrayList2 = arrayList;
		System.out.println("请输入要删除的书籍type");
		Scanner scanner = new Scanner(System.in);
		String type = scanner.next();
		for (Iterator<Book> iterator = arrayList2.iterator(); iterator.hasNext();) {
			Book book = (Book) iterator.next();
			if (book.getType().equals(type)) {
				iterator.remove();
			}
		}
		return arrayList2;
	}

	public ArrayList<Book> modifycount() {
		ArrayList<Book> arrayList2 = arrayList;
		System.out.println("请输入要修改的书籍id");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		Book nBook =findbyid(id);
		if (nBook!=null) {
			System.out.println("请输入要修改的数量");
			int count  = scanner.nextInt();
			nBook.setCount(count);
		} else {
			System.out.println("没有找到这个书籍id");
		}
		return arrayList2;
	}
	public ArrayList<Book> removeBytype() {
		System.out.println("请输入要删除的书本type");
		Scanner scanner = new Scanner(System.in);
		String type = scanner.next();
		List<Book> list = findbytype(type);
		Util util = new Util();
		util.show(list);
		System.out.println("请输入要删除的书本id");
		int id = scanner.nextInt();
		Book book = findbyid(id);
		if (book!=null) {
			arrayList.remove(book);
		}else {
			System.out.println("不存在的书籍");
		}
		return arrayList;
	}
	public Book findbyid(int id) {
		for (Book book : arrayList) {
			if (book.getId() == id) {
				return book;
			}
		}
		return null;
	}
	public void sum() {
		int sum = 0;
		for (Book book : arrayList) {
			sum +=book.getCount();
		}
		System.out.println("总数是"+sum);
	}
	public ArrayList<Book> findbytype(String type) {
		ArrayList<Book> arrayList2 = new ArrayList<Book>();
		for (Book book : arrayList) {
			if (book.getType().equals(type)) {
				arrayList2.add(book);
			}
		}
		return arrayList2;
	}
	public List<Book> comparebyid() {
		List<Book> list = arrayList;
		ComeparByid comeparByid = new ComeparByid();
		Collections.sort(list,comeparByid);
		return list;
		
	}
	public List<Book> comparebyname() {
		List<Book> list = arrayList;
		CompareByName compareByName = new CompareByName();
		Collections.sort(list,compareByName);
		return list;
		
	}
	public List<Book> comparebycount() {
		List<Book> list = arrayList;
		Collections.sort(list,new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				// TODO Auto-generated method stub
				return o1.getCount()-o2.getCount();
			}
		});
		return list;
	}
	public List<Book> comparebyall() {
		List<Book> list = arrayList;
		CompareByAll compareByAll = new CompareByAll();
		Collections.sort(list,compareByAll);
		return list;
	}
}
