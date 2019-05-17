package HomeWork6;

import java.io.File;

/*将三个文本文件中的数据写到一个文件中*/
public class Hk6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\a\\a.txt");
		File file1 = new File("D:\\a\\b.txt");
		File file2 = new File("D:\\a\\c.txt");
		File file3 = new File("E:\\a\\a.txt");
		Manager manager = new Manager();
		manager.add(file, file3);
		manager.add(file1, file3);
		manager.add(file2, file3);
	}

}
