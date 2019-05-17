//31.编写一个方法，求出一个字符串中出现某一个字符的次数，如果没有出现过则输出”没有找到”
import java.util.Scanner;
public class HK4{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		String str2 = scanner.next();
		char cha =str2.charAt(0);
		find(cha,str);
	}
	public static void find(char cha,String str){
		char array[] = str.toCharArray();
		boolean bool = false;
		//System.out.println(cha);
		for(int i =0;i<array.length;i++){
			//System.out.println(array[i]);
			if(array[i]==cha){
				System.out.println(cha+"在第"+(i+1)+"个位置");
				bool = true;
				break;
			}
		}
		if(bool==false){
			System.out.println("没有找到");
		}
	}
}