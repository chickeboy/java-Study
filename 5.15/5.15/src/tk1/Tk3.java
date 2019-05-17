package tk1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 *  1.键盘输入一个文件路径，需要多层级，然后判断是否创建成功
 * 如果不成功，请编写解决方案，完成文件的创建
 * 2.获取一个文件夹的File对象，获取该对象路径下的所有文件或者文件夹
 * 对象，然后遍历输出，遍历输出的时候，请输入一个后缀名，然后删除
 * 符合后缀名信息的文件
 */
public class Tk3 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("请输入一个路径");
			String str = scanner.next();
			File file = new File("D:\\\\javawork\\\\5.14");
			if (file.exists()) {
				System.out.println("该文件已经存在");
				break;
			}
			// 判断文件是否存在是否是真实的
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("请先创建文件夹");
				File f = file.getParentFile();// 直接获取父路径
				f.mkdirs();
				file.createNewFile();
				// 创建这个父路径，让它变成真实存在的
			}
		}
	}
}
