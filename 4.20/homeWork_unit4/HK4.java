/*有一个数列：8，4，2，1，23，344，12
循环输出数列的值
求数列中所有数值的和
猜数游戏：从键盘中任意输入一个数据，判断数列中是否包含此数。*/
import java.util.Scanner;
public class HK4{
	public static void main(String[] args){
		Scanner scanne =new Scanner(System.in);
		int a = scanne.nextInt();
		int array[] = {8,4,2,1,23,344,12};
		int sum = 0;
		boolean bool = false;
		for(int i =0;i<array.length;i++){
			System.out.println(array[i]);
			sum +=array[i];
			if(a==array[i]){
				bool = true;
			}
		}
		System.out.println(sum);
		System.out.println((bool? "包含":"不包含")+a);
	}
}