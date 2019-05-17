package List;

import java.util.ArrayList;

/*1.编写一个方法,键盘录入N条数据
(1)录入的判重依据根据id来进行判重
2.使用2种方式遍历集合
3.键盘输入一个id，获取这个id对应的书本信息（不是单纯打印）
4.键盘输入一个name,获取这个name对应的所有书本信息（不是单纯打印）
5.获取count剩余数量前五位的书本信息（不是单纯打印）
6.键盘输入一个id删除这个id对应书本信息
7.键盘输入一个type删除这个类型对应的所有书本信息
8.键盘输入一个id，通过输入count,可以修改原有书本的count信息
9.计算出所有书本的剩余数量总和
10.键盘输入一个type，然后选择性的删除一本书(再次选择进行删除)
11.根据id进行排序输出
12.根据name 进行降序输出
13.使用匿名内部类对count进行排序
14.根据id排序，如果一直根据name排序，如果一直根据count排序*/
public class List {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> arrayList = new ArrayList<Book>();
		Manager manager =new Manager(arrayList);
		Util util = new Util();
		//录入的判重依据根据id来进行判重
		manager.add();
		//使用2种方式遍历集合
		util.show(manager.dealWith());
		util.showbyinteger(manager.dealWith());	
		//键盘输入一个id，获取这个id对应的书本信息（不是单纯打印）
		util.showbyid(manager.findbyid());
		//键盘输入一个name,获取这个name对应的所有书本信息（不是单纯打印）
		util.showbyid(manager.findbyname());
		//获取count剩余数量前五位的书本信息（不是单纯打印）
		util.show(manager.count());
		//键盘输入一个id删除这个id对应书本信息
		util.show(manager.removebyid());
		//7.键盘输入一个type删除这个类型对应的所有书本信息
		util.show(manager.removeByCount());
		//8.键盘输入一个id，通过输入count,可以修改原有书本的count信息
		util.show(manager.modifycount());
		//9.计算出所有书本的剩余数量总和
		manager.sum();
		//10.键盘输入一个type，然后选择性的删除一本书(再次选择进行删除)
		util.show(manager.removeBytype());
		//11.根据id进行排序输出
		util.show(manager.comparebyid());
		//根据name 进行降序输出
		util.show(manager.comparebyname());
		//使用匿名内部类对count进行排序
		util.show(manager.comparebycount());
		//根据id排序，如果一直根据name排序，如果一直根据count排序*/
		util.show(manager.comparebyall());
	}
}
