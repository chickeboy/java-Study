import java.util.Scanner;

/*有一个数列：8，4，2，1，23，344，12
循环输出数列的值
求数列中所有数值的和
猜数游戏：从键盘中任意输入一个数据，判断数列中是否包含此数。*/
public class HK5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {8,4,2,1,23,344,12};
		for(int i = 0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		int sum = 0;
		for(int i = 0;i<array.length;i++) {
			sum +=array[i];
		}
		System.out.println(sum);
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入查找的数字");
		int a = scanner.nextInt();
		boolean bool = false;
		for(int i = 0;i<array.length;i++) {
			if(a==array[i]) {
				bool = true;
			}
		}
		if(bool) {
			System.out.println("存在");
		}else {
			System.out.println("不存在");
		}
	}

}
