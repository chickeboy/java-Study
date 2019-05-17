import java.util.Arrays;
import java.util.Scanner;

/*7.有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
程序分析：首先判断此数是否大于最后一个数，如果大于最后一个数，
则不插入。然后再考虑插入中间的数的情况，插入后此元素之后的数，依次后移一个位置*/
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
