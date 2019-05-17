package hk9;

import java.util.Scanner;

/*
 * 一个运输公司从网上得到订单，订单上标有货物重量和运输里程，
 * 该公司可以使用3种运输工具：卡车、火车、飞机。编写运输接口，
 * 声明3个接口常量，表示运输工具，声明一个计算运费的方法，
 * 参数是重量和里程。
卡车、火车、飞机分别实现运输接口，计算运费的方法如下：
卡车：运费=重量*距离*120，当距离大于1000km或重量大于60（t）的时候拒载，
返回-1
火车：当距离在900km内，运费=重量*距离*250，大于900km时，
运费=重量*距离*300
飞机：当距离大于500km时，运费=重量*距离*750，否则拒载，返回-1
提示：飞机常量public static final int TRUCK=1
 运输方法：public double cost(double weight,double space);
编写测试类，在命令行中输入重量、距离，main方法中使用运输接口和实现类，通过多态计算出每种工具的运费
 */
public class Hk9 {
	public static void main(String[] args) {
		new Person().pay();
	}
}

class Person {
	public void pay() {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入重量");
			double weight = scanner.nextDouble();
			System.out.println("请输入距离");
			double space = scanner.nextDouble();
			System.out.println("请问您要选择什么运输工具");
			Cal cal = null;
			int choice = scanner.nextInt();
			if (choice > 3 || choice < 1) {
				continue;
			}
			CalFactory calFactory = new CalFactory();
			cal = calFactory.createCal(choice);
			double sum = cal.getSum(weight, space);
			if (sum == -1) {
				System.out.println("您的输入有误");
			} else {
				System.out.println("最终的运费是" + sum);
			}
		}
	}
}

class CalFactory {
	public Cal createCal(int choice) {
		Cal cal = null;
		switch (choice) {
		case Cal.TRAIN:
			cal = new Train();
			break;
		case Cal.TRUCK:
			cal = new Truck();
			break;
		case Cal.PLANE:
			cal = new Plane();
			break;
		default:
			break;
		}
		return cal;
	}
}

interface Cal {
	public int TRUCK = 1;
	public int TRAIN = 2;
	public int PLANE = 3;

	public double getSum(double weight, double space);
}

class Truck implements Cal {

	@Override
	public double getSum(double weight, double space) {
		if (weight <= 0 || space <= 0 || weight > 60 || space > 100) {
			return -1;
		}
		return weight * space * 120;
	}

}

class Train implements Cal {

	@Override
	public double getSum(double weight, double space) {
		if (weight <= 0 || space <= 0) {
			return -1;
		} else if (space <= 900) {
			return weight * space * 250;
		} else {
			return weight * space * 300;
		}

	}

}

class Plane implements Cal {

	@Override
	public double getSum(double weight, double space) {
		if (space <= 500 || weight <= 0) {
			return -1;
		}

		return weight * space * 750;
	}

}
