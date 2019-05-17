import java.util.Scanner;
public class LinearSunch{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int array[] = {10,100,80,50,70,60,90};
		System.out.println("请输入要查找的数字");
		int index = scanner.nextInt();
		boolean input = false;
		int i;
		for(i = 0;i < array.length ; i++){
			if(array[i] == index){
				i+=1;
				input = true;
				break;
			}
		}
		if(input){
			System.out.println("查找到你的数字是第" + i + "位置");
		}else{
			System.out.println("找不到这个数字" );
		}
		 
	}
}