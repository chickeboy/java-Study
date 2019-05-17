/*import java.util.Scanner;
public class Test1{
	public static void main(String[] args){
		int arry1[] = {2,3,4,5,6};
		int arry2[] = new int[5];
		Scanner scanner = new Scanner(System.in);
		for(int i = 0;i<arry2.length;i++){
			arry2[i] = scanner.nextInt();
		}
		for(int i = 0;i<arry1.length;i++){
			System.out.print("下标" + (int)(i+1) + "数值" + arry1[i] + "\t");
		}
		System.out.println();
		for(int i = 0;i<arry2.length;i++){
			System.out.print("下标" + (int)(i+1) + "数值" + arry2[i] + "\t");
		}
	}
}
*/
/*import java.util.Scanner;
public class Test1{
	public static void main(String[] args){
		int array[] = new int[5];
		Scanner scanner = new Scanner(System.in);
		for(int i=0 ; i<array.length ; i++){
			array[i] = scanner.nextInt();
		}
		for(int i=0 ; i<array.length ; i++){
			System.out.println(array[i]);
		}
	}
}
*/
/*import java.util.Scanner;
public class Test1{
	public static void main(String[] args){
		int array[] = new int[4];
		Scanner scanner = new Scanner(System.in);
		for(int i = 0;i<array.length;i++){
			array[i] = scanner.nextInt();
		}
		for(int i = 0;i<array.length;i++){
			if(array[i]%3 == 0){
				System.out.println(array[i]);
			}
		}
	}
}
*/
import java.util.Scanner;
public class Test1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入数组长度");
		int i = scanner.nextInt();
		int array[] = new int[i];
		for(i=0;i<array.length;){
			int a = scanner.nextInt();
			if(a<0){
				System.out.println("输入有误");
			}else{
				array[i] = a;
				i++;
			}
		}
		for(i = 0;i<array.length;i++){
				System.out.println(array[i]);
		}
	}
}