//2.����һ������Ϊ5�����飬�ֶ�¼��5���������ݣ����ұ������
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