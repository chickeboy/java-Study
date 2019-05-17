package hk1;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ModifyManager {
	HashMap<Student, Score> hashMap;
	Util util;

	public ModifyManager(HashMap<Student, Score> hashMap) {
		super();
		this.hashMap = hashMap;
		this.util = new Util(hashMap);
	}

	public void modifybtid() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你要修改的学员id");
		int id = scanner.nextInt();
		Entry<Student, Score> entry = findbyid(id);
		if (entry != null) {
			System.out.println("name");
			String name = scanner.next();
			entry.getKey().setName(name);
			System.out.println("sex");
			String sex = scanner.next();
			entry.getKey().setSex(sex);
			System.out.println("address");
			String address = scanner.next();
			entry.getKey().setAddress(address);
		} else {
			System.out.println("没有找到");
		}
		util.show();
	}

	public void modifbyid() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你要修改的学员id");
		int id = scanner.nextInt();
		Entry<Student, Score> entry = findbyid(id);
		if (entry != null) {
			System.out.println("eng");
			double eng = scanner.nextDouble();
			System.out.println("math");
			double math = scanner.nextDouble();
			System.out.println("chn");
			double chn = scanner.nextDouble();
			entry.setValue(new Score(eng, math, chn));
		} else {
			System.out.println("没有找到");
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

	public void modifbyname() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你要修改的学员name");
		String name1 = scanner.next();
		Entry<Student, Score> entry = findbyname(name1);
		if (entry != null) {
			System.out.println("name");
			String name = scanner.next();
			entry.getKey().setName(name);
			System.out.println("sex");
			String sex = scanner.next();
			entry.getKey().setSex(sex);
			System.out.println("address");
			String address = scanner.next();
			entry.getKey().setAddress(address);
		} else {
			System.out.println("没有找到");
		}
		util.show();
	}
	public void modifbyname2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你要修改的学员name");
		String name1 = scanner.next();
		Entry<Student, Score> entry = findbyname(name1);
		if (entry != null) {
			System.out.println("eng");
			double eng = scanner.nextDouble();
			System.out.println("math");
			double math = scanner.nextDouble();
			System.out.println("chn");
			double chn = scanner.nextDouble();
			entry.setValue(new Score(eng, math, chn));
		} else {
			System.out.println("没有找到");
		}
		util.show();
	}
}
