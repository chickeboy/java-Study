package HomeWork1;

import java.io.File;
import java.util.ArrayList;

/*�������ַ�����
chenhao
zhangsan
zhangsan
chenhao
lisi
wangwu
zhaoliu
xiaoqiang
Haha
�������������򣨳���һ�°�ASCII����Ȼ���򣩣�
�����ļ��϶��������л���ʽ���浽�������ļ����ٴ��ļ��Է����л���ȡ������̨��ʾ*/
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
