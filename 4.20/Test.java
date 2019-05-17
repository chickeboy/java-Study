/*//编写一个方法，创建一个长度为5的数组，并且手动录入5条数据，并且遍历输出，调用测试
import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		
		int array[] = new int[5];
		array(array);
	}
	public static void  array(int array[]){	
		Scanner scanner = new Scanner(System.in);
		for(int i = 0;i<array.length;i++){
			System.out.println("请输入第"+(i+1)+"个数字");
			array[i] = scanner.nextInt();
		}
		for(int i = 0;i<array.length;i++){
			System.out.println(array[i])
		}
	}
}*/
/*//编写一个方法，数组长度由外部参数传入，并且随机赋值，遍历输出，调用测试
import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a  = scanner.nextInt();
		array(a);
	}
	public static void  array(int a){	
		int array[] = new int[a];
		for(int i = 0;i<array.length;i++){
			array[i] = (int)Math.floor(Math.random()*10);
		}
		for(int i = 0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
}*/	
/*创建一个长度为4的数组
(1)编写一个方法，创建数组
(2)手动录入数据编写一个方法，用于遍历数组
(3)调用测试
*/
/*public class Test{
	public static void main(String[] args){
		traverse(array());
	}
	public static int[] array(){
		int array[] ={1,2,3,4};
		return array;
	}
	public static void traverse(int array[]){
		for(int i = 0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
}*/
/*创建一个长度为4的数组
(1)编写一个方法，手动录入4条数据
(2)调用录入方法，键盘上输入一个数，查询是否存在，如果存在打印该数出现的下标位置，不存在则输出-1
(3)调用测试
*/
import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		traverse(array());
	}
	public static int[] array(){
		int array[] =new int[4];
		Scanner scanner = new Scanner(System.in);
		for(int i = 0;i<array.length;i++){
		System.out.println("请输入第"+(i+1)+"个数字");	
		array[i] = scanner.nextInt();
		}
		return array;
	}
	public static void traverse(int array[]){
		Scanner scanner = new Scanner(System.in);
		int index = -1;
		int a= scanner.nextInt();
		for(int i = 0;i<array.length;i++){
			if(array[i]==a){
				index = i;
			}
		}
		if(index == -1){
			System.out.println("不存在");
		}else{
			System.out.println(a+"在第"+ (index+1)+"个位置");	
		}
	}
}


