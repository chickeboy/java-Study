//18.��дһ�����������鳤�����ⲿ�������룬���������ֵ��������������ò���
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