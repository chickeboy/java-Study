package List;

import java.util.Comparator;

public class CompareByName implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o2.getName().compareTo(o1.getName());
	}

}
