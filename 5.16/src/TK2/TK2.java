package TK2;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/*.����һ��ѧ����: id name score
(1)Ҫ�����¼��5�����ݣ�����������id
(2)��дһ����ר�Ų����ļ�����ɶ���д
(3)��д���еĶ�д��������ɹ��ܣ�5������¼����Ϻ󱣴���d:\1.txt�ļ���
(4)����ȡ��5�����ݣ�����score��������Ȼ�󸲸�ԭ������*/

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
