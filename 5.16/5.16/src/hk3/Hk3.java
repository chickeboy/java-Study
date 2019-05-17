package hk3;

import java.io.File;
import java.io.IOException;

/*
 * 4.创建File类对象d:\data\test.txt,测试这个文件是否存在，
 * 如无则创建(目录如不存在先建目录),打印他的读，写，执行权限
 */
public class Hk3 {
	public static void main(String[] args) {
		File file = new File("d:\\data\\test.txt");
		if (!file.exists()) {
			file.getParentFile().mkdirs();
			try {
				file.createNewFile();
				System.out.println(file.canExecute());
				System.out.println(file.canRead());
				System.out.println(file.canWrite());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
