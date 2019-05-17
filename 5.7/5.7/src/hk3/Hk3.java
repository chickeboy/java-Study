package hk3;

/*
 * 在一个类中编写一个方法，
 * 这个方法搜索一个字符数组中是否存在某个字符，如果存在，
 * 则返回这个字符在字符数组中第一次出现的位置（下标），
 * 否则，返回-1。要搜索的字符数组和字符都以参数形式传递给该方法，
 * 如果传入的数组为null，就抛出IllegalArgumentException异常。
在类的main方法中以各种可能出现的
情况测试验证该方法编写的是否正确，
例如：字符不存在，字符存在，
传入的数组为null等,但是无论如何要打印出再见2个字
 */
public class Hk3 {
	public static void main(String[] args) {
		Ut ut = new Ut();
		char[] ct = null;
		char c = 'x';
		try {
			int index = ut.indexOf(ct, c);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("再见");
		}
	}
}

class Ut {
	public int indexOf(char[] ct, char c) {
		if (ct == null) {
			throw new IllegalArgumentException("数组为空");
		}
		int index = -1;
		for (int i = 0; i < ct.length; i++) {
			if (c == ct[i]) {
				index = i;
				break;
			}
		}
		return index;
	}
}
