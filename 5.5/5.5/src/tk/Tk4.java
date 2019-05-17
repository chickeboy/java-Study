package tk;

//finally关键字的使用
//就算遇到异常或者return break
//finally里面的代码块依然会执行
public class Tk4 {
	public static void main(String[] args) {
		try {
			int a = 3 / 0;
		} catch (Exception e) {
			System.out.println("错误");
			return;
		} finally {
			System.out.println("over");
		}

	}
}
