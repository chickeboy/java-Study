package tk;

/*
 * 循环结构  其实就是拆分for表达式中的3个条件
 * 不确定次数的循环
 * 变量初始化
 * while(表达式(进入循环的条件)){
 * 
 * 
 * 迭代语句
 * }
 */
public class Tk6 {
	public static void main(String[] args) {
		// 1 - 10
		int i = 1;
		while (i < 11) {
			System.out.println(i);
			i++;
		}
		System.out.println("===============");
		// continue return
		for (int j = 1; j < 11; j++) {
			if (j == 4) {
				// break;//跳出整个循环
				// continue;// 遇到整个关键字，本次循环结束，直接开始下一次循环
				// return;// 结束当前方法
			}
			System.out.println(j);
		}
		System.out.println("over");
	}
}
