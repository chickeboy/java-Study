import java.util.Scanner;

/*从键盘输入5个数存入一维数组中，先输出下标为奇数的元素，再输出下标为偶数的元素。*/
public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int arry[] = new int[5];
		for(int i = 0;i<arry.length;i++) {
			System.out.println("请输入第"+ (i+1)+"个数字");
			arry[i] = scanner.nextInt();
		}
		System.out.println("下标为奇数的元素");
		for(int i = 0;i<arry.length;i++) {
			if(i%2!=0) {
				System.out.println(arry[i]);
			}
		}
		System.out.println("下标为偶数的元素");
		for(int i = 0;i<arry.length;i++) {
			if(i%2==0) {
				System.out.println(arry[i]);
			}
		}
	}

}
