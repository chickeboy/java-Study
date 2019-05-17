package tk;

/*
 * 分支结构:代码不再是从上往下依次执行所有的代码
 * 现在的代码可能执行，可能不执行
 * if else  if else 
 * break continue return 
 * switch case
 * 1.if(表达式){//满足条件，进入代码块
 * 		// 判断符号 返回的结果是true或者false
 * 无论具体发生的结果是true或者是false
 * 程序员在编写if(表达式)的時候默认都是true
 * 逻辑运算符 &&  ||用来对多个判断表达式进行运算得出最后的结果
 * }
 * 
 */
public class Tk1 {
	public static void main(String[] args) {
		int a = 4;
		int b = 4;
		if (a >= b) {// if语句的表达式肯定会执行一次
			System.out.println("a >= b");
		}
		// 平行结构:多个条件可能出现交集
		// 有必要在设计的时候，把所有的条件都
		// 考虑进去，而且不能有交集
		if (a < b) {
			System.out.println("a < b");
		}
		// 2.if else 如果否则 只有2种情况
		if (a < b) {// if语句的表达式肯定会执行一次
			System.out.println("a < b");
		} else {// 除去if里的条件以外其他任何情况
			System.out.println("a >=b");
			//如果发现题目要求中只有2种情况的
			//判断就可以使用if else
		}//独立完整的代码块，2个代码块永远只会执行一个
	}
}
