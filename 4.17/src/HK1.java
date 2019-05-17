import java.util.Scanner;

/*1.创建一个数组，录入5条数据，键盘输入一个数据，查询数组中是否存在该数据，
 * 如果存在打印出对应的下标位置，如果不存在，打印-1（默认数组中存放的数据不重复）*/
public class HK1 {
	public static void main(String[] args) {
		int array[] = {2,3,4,5,6};
		Scanner scanner =new Scanner(System.in);
		int a = scanner.nextInt();
		boolean bool = true;
		for(int i = 0;i<array.length;i++) {
			if(a==array[i]) {
				System.out.println(i);
				break;
			}else {
				bool = false;
			}
		}
		if(!bool) {
			System.out.println("-1");
		}
	}
}
