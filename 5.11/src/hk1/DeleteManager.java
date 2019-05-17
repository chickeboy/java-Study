package hk1;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
public class DeleteManager {
	HashMap<Student, Score> hashMap;
	Util util;

	public DeleteManager(HashMap<Student, Score> hashMap) {
		super();
		this.hashMap = hashMap;
		this.util = new Util(hashMap);
	}
	public void deletebyid() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你要删除的学生id");
		int id = scanner.nextInt();
		Entry<Student, Score> entry = findbyid(id);
		if (entry!=null) {
			hashMap.remove(entry.getKey(),entry.getValue());
		}
		util.show();
	}
	public Entry<Student, Score> findbyid(int id) {
		Set<Entry<Student, Score>> entrySet = hashMap.entrySet();
		for (Entry<Student, Score> entry : entrySet) {
			if (entry.getKey().getId() == id) {
				return entry;
			}
		}
		return null;
	}

	public Entry<Student, Score> findbyname(String name) {
		Set<Entry<Student, Score>> entrySet = hashMap.entrySet();
		for (Entry<Student, Score> entry : entrySet) {
			if (entry.getKey().getName().equals(name)) {
				return entry;
			}
		}
		return null;
	}
	public void deletebyname() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你要删除的学生name");
		String name = scanner.next();
		Entry<Student, Score> entry = findbyname(name);
		if (entry!=null) {
			hashMap.remove(entry.getKey(),entry.getValue());
		}
		util.show();
	}
}
