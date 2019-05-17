package HomeWork4;

import java.io.File;

/*4.创建File类对象d:\data\test.txt,
测试这个文件是否存在，
如无则创建(目录如不存在先建目录),
打印他的读，写，执行权限*/
public class HK4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("d:\\data\\test.txt");
		FileUtil fileUtil =new FileUtil();
		fileUtil.modification(file);
	}

}
