package tk2;

import java.util.Arrays;
import java.util.Comparator;

public class Tk6 {
	public static void main(String[] args) {
		String[] array = { "ff", "xx", "ccc" };
		CompareByLength byLength = new CompareByLength();
		Arrays.sort(array, new CompareByLength());
		Arrays.sort(array, new Comparator<String>() {
			/*
			 * 接口本身是不能实例化的，但是它的实现类可以new 其实这个没有名字的类体就是接口的实现类，临时写的一个实现类 没有名字而已
			 */
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.length() - o2.length();
			}
		});
		Arrays.sort(array, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		// 当我们发现有的东西只用一次，设置成匿名的
	}
}

class CompareByLength implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o1.length() - o2.length();
	}
}
