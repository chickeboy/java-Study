package tk;

/*
 * 循环的一种结构
 * 初始化变量
 * do{
 * 
 * 
 * 迭代语句
 * } while(表达式)
 * 无论条件是否满足，循环必定会执行一次
 * 第二次开始依然要判断是否满足进入循环的条件
 */
public class Tk12 {
	public static void main(String[] args) {
		int i = 2;
		while (i > 3) {// 先判断
			System.out.println("while..." + i);
			i++;
		}
		do {
			System.out.println("do while..." + i);
			i++;
		} while (i > 3);
	}
}
