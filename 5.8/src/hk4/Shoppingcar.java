package hk4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shoppingcar {
	List<Goods> arrayList= new ArrayList<Goods>();
	List<car> arraylisCars;
	Util util;
	public void sjopping() {
		arrayList.add(new Goods(1, 20));
		arrayList.add(new Goods(2, 5));
		arrayList.add(new Goods(3, 10));
		arrayList.add(new Goods(4, 12));
		arrayList.add(new Goods(5, 23));
		util = new Util();
		util.show(arrayList);
		while (true) {	
			System.out.println("�����빺����Ʒid");
			Scanner scanner = new Scanner(System.in);
			int id = scanner.nextInt();
			System.out.println("�����빺�������");
			int count = scanner.nextInt();
			arraylisCars = new  ArrayList<car>();
			int price;
			try {
				int index = arrayList.indexOf(new Goods(id));
				price = getprice(index);
				arraylisCars.add(new car(id, count, price));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("û�������Ʒ");
			}
			System.out.println("�Ƿ����y/n");
			String a = scanner.next();
			if (a.equals("n")) {
				break;
			}
		}
		
	}
	public int getprice(int index) {
		int price = arrayList.get(index).getPrice();
		return price;
	}
	public void show() {
		util.show2(arraylisCars);
	}
	public void remove() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("������Ҫɾ������Ʒid");
			int id = scanner.nextInt();
			try {
				int index = arraylisCars.indexOf(new car(id));
				arraylisCars.remove(index);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("û���ҵ���Ӧ����Ʒ");
			}
			System.out.println("�Ƿ����y/n");
			String string = scanner.next();
			if (string.equals("n")) {
				break;
			}
		}
	}
	public void modify() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("������Ҫ�޸ĵ���Ʒid");
			int id = scanner.nextInt();
			System.out.println("�������޸ĺ����Ʒ����");
			int count = scanner.nextInt();
			try {
				int index = arraylisCars.indexOf(new car(id));
				car car = arraylisCars.get(index);
				arraylisCars.add(index,new car(id,count,getprice(index)));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("����Ʒ��ɾ������δ������");
			}
			System.out.println("�Ƿ����y/n");
			String string = scanner.next();
			if (string.equals("n")) {
				break;
			}
		}
	}
}
