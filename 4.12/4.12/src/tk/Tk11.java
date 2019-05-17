package tk;

/*
 * 打印出斐波那契数列的前10项值
 * 1 1 2 3 5 8 13 21 34 55 89 144 233  
 * a b c
 * 	 a b c
 */
public class Tk11 {
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		int i = 0;
		int c = 0;
		while (i < 10) {
			System.out.print(a + ",");
			c = a + b;
			a = b;
			b = c;
			i++;
		}
	}
}
