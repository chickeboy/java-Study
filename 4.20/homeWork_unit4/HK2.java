//7.�Ӽ�������5��������һά�����У�����벿�ֵ�Ԫ��ֵȡ���������´���������У����������Ԫ�ء�
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