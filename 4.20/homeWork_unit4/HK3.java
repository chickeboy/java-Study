//18.����һ�����飬¼��5�����ݣ�������е����ֵ����Сֵ
import java.util.Scanner;
public class HK3{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int array[] = {2,10,8,5,6,7};
		int max = array[0];
		int min = array[0];
		for(int i = 0;i<array.length;i++){
			if(array[i]>max){
				max = array[i];
			}
			if(array[i]<min){
				min = array[i];
			}
		}
		System.out.println(max +"\t"+ min);
	}
}