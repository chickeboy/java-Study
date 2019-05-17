package tk;

import java.util.ArrayList;
import java.util.List;

/*创建一个Student类,id  name  age  score
创建一个StudentManager类 提供对学生管理的各种方法
请编写以下方法
1.手动对学生数据进行录入，id重复的数据不能添加
2.遍历输出所有学生信息
3.输入一个id获取该学生的完整信息
4.输入一个name获取所有对应学生的信息
5.获取所有年龄超过15的学员信息
6.输入一个id删除该学生信息
7.输入一个name，先打印出该name对应的学生信息，然后再选择删除具体哪个学生信息
8.使用匿名内部类对集合根据score降序排序*/
public class tk {

	public static void main(String[] args) {
		List<Student> arrayList = new ArrayList<Student>();
		// TODO Auto-generated method stub	
		StudentManager studentManager = new StudentManager(arrayList);
		studentManager.add();
		studentManager.find();
		studentManager.findbyname();
		studentManager.findbyage();
		studentManager.removebyid();
		studentManager.removesclect();
		studentManager.compater();
		
	}

}
