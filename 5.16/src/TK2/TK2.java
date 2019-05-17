package TK2;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/*.创建一个学生类: id name score
(1)要求键盘录入5条数据，判重依据是id
(2)编写一个类专门操作文件，完成读和写
(3)编写类中的读写方法，完成功能，5条数据录入完毕后保存在d:\1.txt文件中
(4)再提取这5条数据，根据score进行排序，然后覆盖原有数据*/

public class TK2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> arrayList = new ArrayList<Student>();
		File o1 =new File("D:\\a\\1.txt");
		ManagerUtil managerUtil = new ManagerUtil(arrayList,o1);
		Util util = new Util();
		util.show(managerUtil.add());
		managerUtil.utilWrite();
		util.show(managerUtil.utilRead());
		TreeSet<Student> treeSet = new TreeSet<Student>();
		treeSet.addAll(arrayList);
		arrayList.addAll(treeSet);
		util.show(arrayList);
		managerUtil.utilWrite();
	}

}
