//��дһ����������һ���ַ���ǰ���ã�������������ò���
import java.util.Scanner;
public class HK5{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		find(str);
	}
	public static void find(String str){
		char array[] = str.toCharArray();
		for(int i =array.length-1;i>=0;i--){
			System.out.print(array[i]);
		}
	}
}