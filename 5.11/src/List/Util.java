package List;

import java.util.List;

public class Util {
	@SuppressWarnings("hiding")
	public <Book> void show(List<Book> list) {
		for (Book book : list) {
			System.out.println(book);
		}
		System.out.println("==================");
	}
	@SuppressWarnings("hiding")
	public <Book> void showbyinteger(List<Book> list) {
		System.out.println("integerѭ��");
		for (Book book : list) {
			System.out.println(book);
		}
		System.out.println("==================");
		
	}
	public void showbyid(Book book) {
		if (book!=null) {
			System.out.println(book);
		}else {
			System.out.println("û���ҵ��Ȿ�鼮");
		}
		System.out.println("==================");
	}
}
