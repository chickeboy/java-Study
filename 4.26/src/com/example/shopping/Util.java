package com.example.shopping;

import java.util.Scanner;

//工具类
public class Util {
	private static Scanner scanner = new Scanner(System.in);
	public static String choice;

	public static boolean isGoOn() {
		System.out.println("请问是否继续");
		choice = scanner.next();
		if (choice.equals("n")) {
			return false;
		}
		return true;
	}

	public static void showGoods(Goods[] goods, String str) {
		System.out.println("===========" + str + "===========");
		for (int i = 0; i < goods.length; i++) {
			if (goods[i] != null) {
				System.out.println(goods[i]);
			}
		}
	}
	public static void showUser(User array[], String str) {
		System.out.println("===========" + str + "===========");
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				System.out.println(array[i]);
			}
		}
	}
	public static void showRecord(Record[] records, String str) {
		System.out.println("===========" + str + "===========");
		for (int i = 0; i < records.length; i++) {
			if (records[i] != null) {
				System.out.println(records[i]);
			}
		}
	}
}
