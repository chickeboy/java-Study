package hk1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 将一个文件夹中的内容复制到其它目录中。
 * （比如:把D:\\chenhao中的内容复制一份到
 *  e:\\zhangsan文件夹中）
(递归和通过字节流来进行复制FileInputStream和FileOutputStream)
 */
public class Hk1 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("d:\\视频");// 父路径
		File f2 = new File("e:\\视频");// 目标路径
		new Util().copy(f1, f2);
	}
}

class Util {
	public void copy(File f1, File f2) throws IOException {
		f2.mkdirs();// 创建目标文件夹
		File[] listFiles = f1.listFiles();// 获取一级下的所有 File对象
		for (File file : listFiles) {
			// "D:\工作 + \\ + Hk1.java
			// "E:\工作+ \\ + Hk1.java
			// "D:\工作 \HK E:\\工作 + \\ +HK
			if (file.isFile()) {
				FileInputStream fis = new FileInputStream(file);// 源文件
				FileOutputStream fos = new FileOutputStream(f2.getAbsoluteFile() + "\\" + file.getName());// 输出流
				int len = -1;
				byte[] bt = new byte[8 * 1024 * 1024];
				while ((len = fis.read(bt)) != -1) {
					fos.write(bt, 0, len);
				}
				fis.close();
				fos.close();
			} else {
				copy(file, new File(f2.getAbsoluteFile() + "\\" + file.getName()));
			}
		}
	}
}
