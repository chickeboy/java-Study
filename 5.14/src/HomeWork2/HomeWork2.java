package HomeWork2;
/*写两个线程，一个线程打印 1~52，另一个线程打印字母A-Z打印顺序为12A34B56C……Y5152Z（2个数字1个字母）。
提示：使用线程间的通信。
提示：使用线程同步*/
public class HomeWork2 {

	public static void main(String[] args) {
		All all = new All();
		// TODO Auto-generated method stub
		new OutPut2(all).start();
		new Output(all).start();
	}

}
