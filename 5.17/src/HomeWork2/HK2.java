package HomeWork2;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/*2.使用对象流做一个增,删,改,查的功能.  Student对象(学号,成绩,姓名,地址)*/
public class HK2 {

	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		// TODO Auto-generated method stub
		File file = new File("b.txt");
		Manager manager = new Manager(arrayList, file);
		Util util =new Util();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("请选择操作");
			System.out.println("1.增");
			System.out.println("2.删");
			System.out.println("3.改");
			System.out.println("4.查");
			System.out.println("5.退出");
			int a = scanner.nextInt();
			switch (a) {
			case 1:
				manager.write(manager.add());
				break;
			case 2:
				manager.write(manager.remove());
				break;
			case 3:
				manager.write(manager.updata());
				break;
			case 4:
				util.show(manager.read());
				break;
			case 5:
				return;
			default:
				break;
			}
		}
	}

}
