package HK4;

import java.util.Scanner;

/*4.小红养了两只猫，一只叫小黑，今年2岁，
黑色，另一只叫小白，今年5岁，白色。
请编写一个程序，要求当用户输入小猫的名字时，
就显示猫的名字、年龄和颜色。如果用户输入的小猫名字错误，
则显示“小红没有养这只猫”。*/
public class HK4 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		if(str.equals("小黑")) {
			cat.blackcat();
		}else if (str.equals("小白")) {
			cat.whitecat();
		}else {
			System.out.println("小红没有养这只猫");
		}
	}
}
