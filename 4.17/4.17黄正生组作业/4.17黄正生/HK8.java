import java.util.Arrays;
import java.util.Scanner;

/*7.��һ���Ѿ��ź�������顣������һ������Ҫ��ԭ���Ĺ��ɽ������������С�
��������������жϴ����Ƿ�������һ����������������һ������
�򲻲��롣Ȼ���ٿ��ǲ����м�����������������Ԫ��֮����������κ���һ��λ��*/
public class HK8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[1000];
		int subscript = 0;
		for(int i=0;i<array.length;i++) {
			array[i] = (int)Math.floor(Math.random()*1000);
		}
		Arrays.sort(array);
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		if(a>array[array.length-1]) {
			System.out.println(a);
		}else{
			for(int i = 0;i<array.length;i++) {
				if(a>array[i]) {
					subscript = i;
				}
			}
			System.out.println(subscript);
			int arrays[]= Arrays.copyOfRange(array, 0, array.length+1);
			System.out.println(subscript);
			arrays[subscript+1] = a;
			System.arraycopy(array, subscript+1, arrays, subscript+2, array.length-subscript-1);
			System.out.println(arrays[subscript+1]);
		}
	}

}
