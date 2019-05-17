nnimport java.util.Scanner;

/*有一个猜数字的游戏，生成一个0-10的随机数，键盘输入一个数，判断是否在范围内
如果是的打印包含，不是的打印不包含（0-10 10-20 判断在哪个区间内）*/
public class Hk5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = (int) Math.floor(Math.random() * 10);
		System.out.println(b);
		int c = (int) Math.floor(Math.random() * 20 + 10);
		System.out.println(c);
		String str = "是";
		if (a < b || a > c) {
			str = "不是";
		}
		System.out.println(a + str + "范围内的数字");
	}

}
