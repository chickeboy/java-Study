//��������x��ֵ����������ͼƬ�ó�y��ֵ
import java.util.Scanner;
public class HK5{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int x  = scanner.nextInt();
		int y = 0;
		if(x>0){
			y=1;
		}else if(x==0){
			y=0;
		}else{
			y=-1
		}
		System.out.println(y);
	}
}