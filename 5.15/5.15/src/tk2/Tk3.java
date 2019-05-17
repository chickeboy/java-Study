package tk2;

import java.io.File;
import java.io.IOException;

/*
 * 遍历一个文件夹下所有的子文件夹内容
 * 使用递归 方法自己调用自己
 */
public class Tk3 {
	public static void main(String[] args) {
		new FileUtil().show(new File("D:\\BaiduNetdiskDownload"));
	}
}

class FileUtil {
	public void show(File file) {// d://a
		File[] listFiles = file.listFiles();// 先获取这一层文件夹下所有的File对象
		for (File f : listFiles) {// 遍历当前所有对象
			if (f.isDirectory()) {
				System.out.println("文件夹" + f.getAbsolutePath());
				show(f);
			} else {
				System.out.println("文件:" + f.getAbsolutePath());
			}
		}
	}
}
