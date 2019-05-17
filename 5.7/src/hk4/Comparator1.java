package hk4;

import java.util.Comparator;

public class Comparator1 implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		String str1 = (String)o1;
		String str2 = (String)o2;
		// TODO Auto-generated method stub
		if (str1.length()!=str2.length()) {	
			return str1.length()-str2.length();
		}else {
			return str1.compareTo(str2);
		}
	}

}
