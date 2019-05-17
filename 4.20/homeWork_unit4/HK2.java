//7.从键盘输入5个数存入一维数组中，将左半部分的元素值取倒数后重新存入该数组中，并输出所有元素。
import java.util.Scanner;
public class HK2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double array[] =new double[5];
		for(int i = 0;i<array.length;i++){
			array[i] = scanner.nextDouble();
			if(i<array.length/2){
				array[i] = 1/array[i];
			}
		}
		for(int i = 0;i<array.length;i++){
			System.out.print(array[i] + "\t");
		}
	}
}