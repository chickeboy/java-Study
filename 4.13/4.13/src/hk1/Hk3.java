package hk1;

import java.util.Scanner;

/*
 * 3.完成购买商品结算功能：
循环输入商品编号和购物数量，计算消费金额并累加到总金额
输入“n”开始结账（假设享8折）
输入实付金额，计算找零
 */
public class Hk3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double apple = 1;
		double banana = 2;
		double peach = 3;
		double sum = 0;// 总价
		double price = 0;// 单价
		while (true) {
			System.out.println("1.苹果 1元  2.香蕉 2元 3.桃子 3元");
			System.out.println("请输入要购买的商品编号");
			int id = scanner.nextInt();
			switch (id) {
			case 1:
				price = apple;
				break;
			case 2:
				price = banana;
				break;
			case 3:
				price = peach;
				break;
			default:
				break;
			}
			System.out.println("请输入要购买的数量");
			int count = scanner.nextInt();
			sum = count * price;// 计算总价
			System.out.println("请问是否要继续");
			String choice = scanner.next();
			if (choice.equals("n") || choice.equals("N")) {
				break;// 跳出购买循环
			}
		}
		System.out.println("请支付");
		double pay = scanner.nextDouble();
		sum *= 0.8;// 打8折
		if (pay >= sum) {
			System.out.println("支付成功,付款...." + pay + "找零 " + (pay - sum));
		} else {
			System.out.println("没钱就滚蛋");
		}
	}
}
