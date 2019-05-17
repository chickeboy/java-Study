package Set;

import java.util.Iterator;
import java.util.Set;

public class Util {
	@SuppressWarnings("hiding")
	public <Book> void show(Set<Book> set) {
		for (Book book : set) {
			System.out.println(book);
		}
		System.out.println("======================================");
	}
	public <Book> void showbyingeter(Set<Book> set) {
		for (Iterator<Book> iterator = set.iterator(); iterator.hasNext();) {
			Book book = (Book) iterator.next();
			System.out.println(book);
		}
		System.out.println("======================================");
	}
	public void showbybook(Book book) {
		System.out.println(book);
	}
}
