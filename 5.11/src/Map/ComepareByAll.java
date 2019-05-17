package Map;

import java.util.Comparator;
import java.util.Map.Entry;

public class ComepareByAll implements Comparator<Entry<Integer, Book>> {

	@Override
	public int compare(Entry<Integer, Book> o1, Entry<Integer, Book> o2) {
		// TODO Auto-generated method stub
		if (o1.getKey()!=o2.getKey()) {
			return o1.getKey()-o2.getKey();
		}else if (!o1.getValue().getName().equals(o2.getValue().getName())) {
			return o1.getValue().getName().compareTo(o2.getValue().getName());
		}else {
			return o1.getValue().getCount()-o2.getValue().getCount();
		}
	}

}
