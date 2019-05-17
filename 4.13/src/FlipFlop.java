/*开发一个标题为”FlipFlop”的游戏应用程序。
它从1计数到100，遇到3的倍数就替换为单词”Flip”,
5的倍数就替换为单词”Flop”,
既为3的倍数又为5的倍数则替换为单词”FlipFlop”,
其余情况下输出当前数字*/

public class FlipFlop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1;i<=100;i++) {
			if(i%3==0&&i%5==0) {
				System.out.println("FlipFlop");
				continue;
			}else if(i%3==0) {
				System.out.println("Flip");
			}else if(i%5==0) {
				System.out.println("Flop");
			}else {
				System.out.println(i);
			}
		}
	}

}
