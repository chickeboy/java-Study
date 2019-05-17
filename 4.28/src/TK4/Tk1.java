package TK4;

import java.util.Scanner;

/*编写一下场景，要求，输入一个手机卡的名称可以通过名称获取两种不同手机卡，比如联通和移动。*/
public class Tk1 {
	public static void main(String[] args) {
		System.out.println("请输入你要的电话卡名字");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		Faactory faactory = new Faactory(str);
		faactory.creat();
		if(str==null) {
			System.out.println("你输入的卡错误");
		}else {
			
		}
		
	}
}
