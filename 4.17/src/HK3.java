import java.util.Scanner;

/*3.创建一个字符串数组，长度为4，输入4个学员姓名，键盘输入姓氏，
 * 分别输出该姓氏第一次出现的下标位置，和最后一次出现的下标位置，如果不存在，则打印不存在*/
public class HK3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array[] = { "张三", "张四", "张五", "小明" };
		int arrays[] = new int[array.length];
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		boolean bool = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i].contains(str)) {
				arrays[i] = i;
				bool = true;
			} else {
				arrays[i] = -1;
			}
		}
		if (!bool) {
			System.out.println("不存在");
		}
		int first  =0;
		int last = 0;
		for (int i = 0; i < array.length; i++) {
			if(arrays[i]!=-1) {
				last = i;
			}
		}
		for (int i = 0; i < array.length; i++) {
			if(arrays[i]!=-1) {
				first = i;
				break;
			}
		}
		System.out.println("第一次出现"+first+"最后一次出现"+last);
	}
}
