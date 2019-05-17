package HomeWork4;

import java.io.File;

/*获取一个文件夹下所有指定后缀名(.java)的文件（包括子文件夹中的内容），并将这些文件的绝对路径写入到一个文本文件中*/
public class HK4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\a\\c.txt");
		Manager manager = new Manager(file);
		File file2 = new File("D:\\javawork\\5.15");
		manager.addFiles(file2);
	}
}
