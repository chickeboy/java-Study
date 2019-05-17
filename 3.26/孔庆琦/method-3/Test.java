/*
在main方法中创建一个长度为7的数组
要求完成以下功能：
1.编写一个方法，传入数组，循环录入数据(输入时可以默认不重复)
2.编写一个方法，传入一个数，查询这个数是否存在
如果存在，则返回该数在数组中出现的下标，如果不存在返回-1
3.编写一个方法，遍历数组并且输出
4.将写好的方法自行进行调用测试结果。

*/
import java.util.*;
public class Test{
	public static void main(String[] args){
		//1.创建数据源
		int[] array = new int[7];
		init(array);//先初始化
		System.out.println("============初始数据============");
		show(array);
		System.out.println("请输入您要查询的数");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int index = findByNum(array,num);
		if(index == -1){
			System.out.println("您查找的数不存在");
		}else{
			System.out.println("您查找的数在第" + (index + 1) +"位");
		}
	}
	//java只有值传递，这里是引用数据类型传递
	public static void init(int[] array){
		for(int i = 0;i < array.length;i++){
			System.out.println("请输入一个数");
			Scanner scn = new Scanner(System.in);
			array[i] = scn.nextInt();//对每个位置进行赋值
		}
	}
	public static int findByNum(int[] array,int num){
		int index = -1;//因为下标是不可能出现负数的，所以默认没有该数
		for(int i = 0; i < array.length;i ++){
			if(array[i] == num){
				index = i;//保留下标
				break;//默认不重复，此时可以跳出
			}
		}
		return index ;//这里的index -1的话表示循环中if语句没有进入过，如果不是-1那么就表示该数出现了
	}
	public static void show(int[] array){
		for(int x : array){
				System.out.println(x);
		}
	}
}