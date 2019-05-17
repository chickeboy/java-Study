package tk1;

import java.io.File;
import java.io.FileFilter;

/*
 * 获取某一层文件夹路径下的所有File对象
 * 
 * 1.键盘输入一个文件路径，需要多层级，然后判断是否创建成功
 * 如果不成功，请编写解决方案，完成文件的创建
 * 2.获取一个文件夹的File对象，获取该对象路径下的所有文件或者文件夹
 * 对象，然后遍历输出，遍历输出的时候，请输入一个后缀名，然后删除
 * 符合后缀名信息的文件
 */
public class Tk2 {
	public static void main(String[] args) {
		File file = new File("F:\\Mysql");// 未知倒是文件还是文件夹
		if (file.isDirectory()) {// 是否是文件夹
			// file.isFile()是否是文件
			File[] listFiles = file.listFiles();
			// 接收这一层文件夹下的所有File对象，装在容器中
			for (File f : listFiles) {
				System.out.println(f.getAbsolutePath());
			}
		} else {
			System.out.println("不是文件");
		}
		File[] listFiles = file.listFiles(new FileFilter() {
			// 在返回数组的时候传入一个过滤器的实现类对象
			// 返回值返回的是我需要装进数组的File对象
			// accept返回值为true的情况才是我需要的
			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return pathname.getName().endsWith(".exe");
			}
		});
		for (File file2 : listFiles) {
			System.out.println(file2.getName());
		}

	}
}
