package tk;

/*
 * 双重循环 嵌套循环
 * for for
 * 
 */
public class Tk14 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {// int j = 0执行了5次
				// 外循环执行一次 内循环执行5次
				// 内循环的j循环控制变量，每次外循环都会生成一个新的
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		System.out.println("=================");
	}
}
