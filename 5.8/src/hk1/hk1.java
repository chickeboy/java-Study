package hk1;

import java.util.ArrayList;
import java.util.List;
/*学生类：id name age
写一个方法，循环录入五条数据
写一个方法，删除id为10的人
写一个方法，查询集合中是否存在一个叫李四的人
写一个方法，查询集合中是否有一个叫王五并且年龄为32的人
写一个方法，获取集合中名字叫王五，年龄为32，id为4的人的下标
通过这个下标对这个人进行修改 修改他的年龄为55
写一个方法，遍历输出所有学生的信息
写一个方法，写一个方法遍历输出所有年龄为4的学员信息*/
public class hk1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> arrayList = new ArrayList<Student>();
		Studentmanager studentmanager = new Studentmanager(arrayList);
		studentmanager.add();
		studentmanager.remove();
		System.out.println(studentmanager.find());
		System.out.println(studentmanager.findbyname());
		System.out.println(studentmanager.findbyall());
		studentmanager.show();
	}

}
