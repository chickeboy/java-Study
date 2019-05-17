package tk2;

/*
 * 遍历一个文件夹下所有的子文件夹内容
 * 使用递归 方法自己调用自己
 * 方法总有结束的一个条件
 * 1 + 2 + 3 + ..... + 100
 * 
 */
public class Tk2 {
	public static void main(String[] args) {
		System.out.println(new Util().get(100));
		System.out.println(new Util().getFe(100));
	}
}

class Util {
	public int get(int num) {
		if (num == 1) {
			return 1;
		}
		int x = num + get(num - 1);
		System.out.println("num = " + num + " x = " + x);
		return x;
	}

	public int getFe(int num) {
		if (num == 1 || num == 2) {
			return 1;
		}
		return getFe(num - 1) + getFe(num - 2);
		// 4 + 3
		//
	}
}
