//18.编写一个方法，数组长度由外部参数传入，并且随机赋值，遍历输出，调用测试
import java.util.Scanner;
public class HK3{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a  = scanner.nextInt();
		output(a);
		
	}
	public static void output(int a ){
		int array[] = new int[a];
		for(int i =0;i<array.length;i++){
			array[i] = (int)Math.floor(Math.random()*10);
		}
		for(int i =0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
}