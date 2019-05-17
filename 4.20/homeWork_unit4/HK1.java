//2.创建一个长度为5的数组，手动录入5个整数数据，并且遍历输出
import java.util.Scanner;
public class HK1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int array[] = new int[5];
		for(int i =0;i<array.length;i++){
			array[i] = scanner.nextInt();
		}
		for(int i =0;i<array.length;i++){
			System.out.print(array[i]+"\t");
		}
	}
}