package tk;

/*
 * 一种特殊的情况
 * 循环编写的次数和最终的执行次数不一样
 * 或者有筛选需要和条件语句结合使用
 */
public class Tk7 {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println("第" + (i + 1) + "次");
			if (i % 2 != 0) {
				System.out.println("奇数" + i);
			}
		}
	}
}
