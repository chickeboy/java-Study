/*��һ�����У�8��4��2��1��23��344��12
ѭ��������е�ֵ
��������������ֵ�ĺ�
������Ϸ���Ӽ�������������һ�����ݣ��ж��������Ƿ����������*/
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
		System.out.println((bool? "����":"������")+a);
	}
}