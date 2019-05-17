package tk;

/*
 * 循环变量的迭代可以不仅仅是++
 * 
 */
public class Tk2 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
		}
		System.out.println("=================");
		for (int i = 0; i < 10; i += 2) {
			System.out.println("i = " + i);
		}
		System.out.println("=================");
		for (int i = 1; i < 10; i *= 2) {
			System.out.println("i = " + i);
		}
		System.out.println("=================");
		for (boolean b = false; b != true; b = true) {
			System.out.println("b = " + b);
		}
	}
}
