package hk1;

/*
 * 使用while循环和双重循环打印出99乘法表
 * 1 * 1
 * 2 * 1  2 * 2
 * 3 * 1  3 * 2  3 * 3
 */
public class Hk1 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}
		int x = 1;// 代表行数
		int y = 1;
		while (x < 10) {
			System.out.print(x + "*" + y + "=" + x * y + "\t");
			y++;// y == x的时候应该换行了
			if (y > x) {
				x++;// 换行
				y = 1;// y重新从1开始计算
				System.out.println();
			}
		}
	}
}
