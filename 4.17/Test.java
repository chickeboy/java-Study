import java.util.Scanner;
import java.util.Arrays;
public class Test{
	public static void main(String[] args){
		int array[] = new int[5];
		int i = 0;
		for(i = 0;;i++){
			Scanner scanner = new Scanner(System.in);
			System.out.println("�������"+(i+1)+"����");
			array[i] = scanner.nextInt();
			System.out.println("�Ƿ�Ҫ����y/n");
			String str = scanner.next();
			if(str.equals("n")){
				break;
			}
			if(i == array.length-1){
				array = Arrays.copyOf(array,i*2+1);
			}
		}
		for(int j = 0;j<i;j++){
			System.out.print(array[j] +"\t");
		}
	}
}