package HomeWork3;

import java.io.File;

/*1.在文本文件中存有斐波那契数列，1,1,2,3,5,8,13,21,34,55…读取第12个数*/
public class HK3 {
	public static void main(String[] args) {
		File file = new File("D:\\a\\b.txt");
		Manager manager = new Manager(file);
		manager.write(manager.addArrayList());
		manager.read();
	}
}
