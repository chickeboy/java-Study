package List;

import java.util.Comparator;

public class CompareByAll implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		if (o1.getId()!=o2.getId()) {
			return o1.getId()-o2.getId();
		}else if (!o1.getName().equals(o2.getName())) {
			 return o1.getName().compareTo(o2.getName());
		}else {
			return o1.getCount() -o2.getCount();
		}
	}
	
}
