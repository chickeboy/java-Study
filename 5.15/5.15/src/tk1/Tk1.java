package tk1;

import java.io.File;
import java.io.IOException;

/*
 * I O 
 * Input  OutPut
 *   内存.读入	 内存.写出
 */
public class Tk1 {
	public static void main(String[] args) {
		// File 抽象的提取一个文件路径的对象，用于操作文件
		File file = new File("d:\\a\\b\\c");//
		// pathname是一个虚拟路径 可能是存在的也可能是不存在的
		System.out.println(file.getAbsolutePath());// 绝对路径
		System.out.println(file.getParent());
		// 直接从根目录开始的一个完整路径
		System.out.println(file.getName());// 文件名
		// System.out.println(file.delete());// 删除
		System.out.println(file.mkdir());// 创建文件夹
		// 只能创建一层文件夹,在父路径真实存在的情况下
		// 才能创建一层子文件夹
		// 让这个虚拟路径变成真实路径 创建文件
		System.out.println(file.mkdirs());// 可以创建多层级文件夹
		// 文件的创建
		File file2 = new File("d:\\a\\b\\c\\1.txt");
		// 抽象路径是不会区分文件或者文件夹的
		try {
			System.out.println(file2.createNewFile());
			// 创建文件父路径必须真实存在的
		} catch (IOException e) {
			e.printStackTrace();
		} // 创建新文件夹
	}
}
