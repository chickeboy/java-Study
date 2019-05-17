package fortk;

/*
 * 1.开发一个标题为”FlipFlop”的游戏应用程序。
 * 它从1计数到100，遇到3的倍数就替换为单词”Flip”,
 * 5的倍数就替换为单词”Flop”,
 * 既为3的倍数又为5的倍数则替换为单词”FlipFlop”,
 * 其余情况下输出当前数字
 */
public class Tk1 {
	public static void main(String[] args) {
		String str = null;
		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				str = "FlipFlop";
			} else if (i % 3 == 0) {
				str = "Flip";
			} else if (i % 5 == 0) {
				str = "Flop";
			} else {
				str = i + "";
			}
			System.out.println(str);
		}

	}
}
