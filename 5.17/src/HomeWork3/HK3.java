package HomeWork3;

import java.io.File;

/*创建一个动物类，具有name.age.sex，
从键盘输入动物的信息的同时使用io流保存这些信息
到d:\\1.txt，并且将这些信息存放入动物的对象，
存放入一个TreeSet集合（要求根据年龄进行排序）
只要生成5个对象即可，最后创建一个方法，
读取1.txt中的信息并且输出打印*/
public class HK3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("1.txt");
		Manager manager = new Manager(file);
		manager.write();
		manager.read();
	}

}
