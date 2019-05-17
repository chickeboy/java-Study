package tk2;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 菜单模式
 */
public class Tk1 {
	public static Scanner scanner = new Scanner(System.in);
	public static String choice;// 用户选择变量
	public static String[] array = new String[5];// 存放学生姓名数组
	public static int size = 0;// 数组中实际元素的个数

	// 全局变量，整个类中所有的方法都可以使用同一个scanner
	public static void main(String[] args) {
		mainMenu();
	}

	// 主菜单
	public static void mainMenu() {
		while (true) {
			System.out.println("========学生管理系统========");
			System.out.println("1.登录");
			System.out.println("2.退出");
			choice = scanner.next();
			switch (choice) {
			case "1":
				loginMenu();
				break;
			case "2":
				System.exit(0);
				break;

			default:
				break;
			}
		}
	}

	// 登录界面
	public static void loginMenu() {
		int count = 0;
		while (true) {
			System.out.println("账号");
			String name = scanner.next();
			System.out.println("密码");
			String passWord = scanner.next();
			if (name.equals("admin") && passWord.equals("111")) {
				System.out.println("登录成功");
				studentMainMenu();
				return;
			} else {
				count++;
				System.out.println("您还剩下......" + (3 - count) + "次机会");
				if (count == 3) {
					System.out.println("对不起，再见");
					break;
				}
			}
		}
	}

	public static void studentMainMenu() {
		while (true) {
			System.out.println("=========学生管理界面=========");
			System.out.println("1.添加学生");
			System.out.println("2.删除学生");
			System.out.println("3.查看学生");
			System.out.println("4.修改学生");
			System.out.println("5.返回上一级");
			choice = scanner.next();
			switch (choice) {
			case "1":
				addMenu();
				break;
			case "2":
				break;
			case "3":
				searchAllMenu();
				break;
			case "4":
				break;
			case "5":
				return;
			default:
				break;
			}
		}
	}

	public static void searchAllMenu() {
		searchArray("所有学员信息");
	}

	public static void searchArray(String str) {
		System.out.println("===========" + str + "===========");
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
	}

	// 添加学生信息菜单
	public static void addMenu() {
		while (true) {
			System.out.println("姓名");
			String name = scanner.next();
			if (add(name)) {
				System.out.println("添加成功");
			} else {
				System.out.println("添加失败");
			}
			if (!isGoOn()) {
				break;
			}
		}
	}

	// 是否继续 返回值位false表示不继续
	public static boolean isGoOn() {
		System.out.println("请问是否继续");
		choice = scanner.next();
		if (choice.equals("n")) {
			return false;
		}
		return true;
	}

	// 添加学生逻辑 重复不能添加
	public static boolean add(String name) {
		bigger();// 先判断数组是否够大
		if (indexOf(name) == -1) {// 没有找到重复的
			array[size++] = name;// 尾插
			return true;
		}
		return false;
	}

	public static void bigger() {
		if (size == array.length) {
			array = Arrays.copyOf(array, size * 2 + 1);
		}
	}

	public static int indexOf(String name) {
		int index = -1;
		for (int i = 0; i < size; i++) {// 匹配实际个数的元素
			if (name.equals(array[i])) {
				index = i;
				break;
			}
		}
		return index;
	}
}
