package Map;

import java.util.Comparator;
import java.util.Map.Entry;

public class CompareByCount implements Comparator<Entry<Integer, Book>> {

	@Override
	public int compare(Entry<Integer, Book> o1, Entry<Integer, Book> o2) {
		// TODO Auto-generated method stub
		return o2.getValue().getCount()-o1.getValue().getCount();
	}

}
