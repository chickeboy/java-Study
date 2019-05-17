package HomeWork1;

import java.io.File;
import java.util.ArrayList;

/*有以下字符串：
chenhao
zhangsan
zhangsan
chenhao
lisi
wangwu
zhaoliu
xiaoqiang
Haha
按长度升序排序（长度一致按ASCII码自然升序），
排序后的集合对象以序列化方式保存到二进制文件，再从文件以反序列化读取到控制台显示*/
public class HK1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("a.txt");
		Manager manager = new Manager(file);
		manager.write(manager.add());
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList = manager.read();
		for (String string : arrayList) {
			System.out.println(string);
		}
	}

}
