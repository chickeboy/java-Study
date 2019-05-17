package HomeWork5;

import java.io.File;
/*1)用代码实现创建文件夹iotek,iotek中创一个文件夹iotekson,在iotekson中创建2个文件1.txt和2.txt，
 * 要求1.txt中的内容由键盘输入的信息决定，输入完毕后赋值内容到2.txt中，读取2.txt输出打印。
2)复制iotek文件夹下所有内容到另外一个盘中，生成一个新的文件夹newiotek,复制完毕提示”.....复制完毕”
3)要求请捕获程序中可能出现的各种异常。*/
public class HK5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\a\\iotek");
		File file1 = new File("D:\\a\\iotek\\1.txt");
		File file2 = new File("D:\\a\\iotek\\2.txt");
		File file3 = new File("E:\\a\\newiotek");
		Mnaager manager = new Mnaager(file, file1, file2);
		manager.folder();
		manager.file();
		manager.add();
		manager.copy();
		manager.copyA(file, file3);
	}

}
