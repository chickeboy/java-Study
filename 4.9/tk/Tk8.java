package tk;

/*
 * 多条件的判断
 */
public class Tk8 {
	public static void main(String[] args) {
		// && ||
		// 判断一个数是否在 3 - 5之间
		int a = 4;
		// 2个表达式都是true最后的运算结果才是true
		if (a >= 3 && a <= 5) {
			System.out.println("满足");
		} else {
			System.out.println("不满足");
		}
		if (a <= 3 || a >= 5) {
			System.out.println("满足");
		} else {
			System.out.println("不满足");
		}
		// 三元运算符
		int x = 1;
		String str = null;
		str = x > 0 ? "正数" : "负数";
		
		
		
		
		
	}
}
