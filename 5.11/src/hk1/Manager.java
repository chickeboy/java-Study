package hk1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Manager {
	HashMap<Student, Score> hashMap ;
	
	public Manager(HashMap<Student, Score> hashMap) {
		super();
		this.hashMap = hashMap;
	}
	public void add() {
		hashMap.put(new Student(1, "张三", "男", "北京"),new Score(58.2, 89.3, 57.2));
		hashMap.put(new Student(1, "李四", "男", "北京"),new Score(58.2, 89.3, 57.2));
		hashMap.put(new Student(2, "李四", "男", "上海"),new Score(98.3, 54.2, 63.4));
		hashMap.put(new Student(3, "王五", "男", "重庆"),new Score(69.5, 85.3, 63.7));
		hashMap.put(new Student(4, "张六", "男", "成都"),new Score(96.4, 57.6, 59.6));
		hashMap.put(new Student(5, "赵八", "男", "上海"),new Score(96.4, 85.7, 46.8));
		hashMap.put(new Student(6, "小红", "女", "浙江"),new Score(56.7, 88.5, 63.4));
		hashMap.put(new Student(7, "小兰", "女", "福建"),new Score(56.7, 89.4, 66.4));
	}
	//eng math chn
	public String input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要查找的成绩");
		System.out.println("eng");
		System.out.println("math");
		System.out.println("chn");
		String string = scanner.next();
		return string;		
	}
	//4.打印出所有学科的平均分  
	public void dealWithAvg() {
		Util util = new Util();
		int cout = 0;
		double sum=0;
		Set<Entry<Student,Score>> entrySet = hashMap.entrySet();
		for (Entry<Student, Score> entry : entrySet) {
			sum +=entry.getValue().getEng();
			cout++;
		}
		util.showavg("Eng", sum/cout);
		sum = 0;
		cout = 0;
		for (Entry<Student, Score> entry : entrySet) {
			sum +=entry.getValue().getMath();
			cout++;
		}
		util.showavg("math", sum/cout);
		sum = 0;
		cout = 0;
		for (Entry<Student, Score> entry : entrySet) {
			sum +=entry.getValue().getChn();
			cout++;
		}
		util.showavg("chn", sum/cout);
	}
	public List<Entry<Student,Score>> comparebyavg() {
		List<Entry<Student,Score>> list = new ArrayList<Entry<Student,Score>>(hashMap.entrySet());
		return list;		
	}
	
	public TreeMap<Student, Score> comparebyid() {
		TreeMap<Student, Score> treeMap = new TreeMap<Student, Score>();
		treeMap.putAll(hashMap);
		return treeMap;
	}
}
