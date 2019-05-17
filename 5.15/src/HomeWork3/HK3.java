package HomeWork3;

import java.io.File;

/*编写一个程序，提示用户输入一个文件名（包含路径），然后去读入这个文件，并统计文件中每个字符出现的频率。
提示：文件需要提前准备好，里面都为字符*/
public class HK3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\a\\aa.txt");
		FileUtil fileUtil = new FileUtil();
		fileUtil.show(file);
	}

}
