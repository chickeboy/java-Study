package �½��ļ���;
import java.util.*;
public class Test{
	public static void main(String[] args){
		int array[] = new int[1000];
		for(int i = 0;i<array.length;i++){
			array[i] = (int)Math.floor(Math.random()*1000);
		}
		Arrays.sort(array);
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int start = 0;
		int end = array.length;
		int minder=0;
		int index=-1;
		while(end != start){			
			minder = (start+end)/2;
			if(array[minder]==a){
				index = minder;
				break;
			}else if(array[minder]<a){
				start = minder+1;
			}else{
				end = minder;
			}
		}
		if(index !=-1){
			System.out.println(a+"������ĵ�"+(index+1)+"��λ��");
		}else{
			System.out.println("���ֲ�����");
		}
		
	}
}