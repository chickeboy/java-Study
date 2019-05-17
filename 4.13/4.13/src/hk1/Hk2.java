package hk1;

import java.util.Random;
import java.util.Scanner;

/*
 * 2.现有一个电视商品竞猜活动
活动规则：
随机出现一个电视的价格（2000-10000之间），
用户去竞猜价格，如果在5次内猜对价格，便可获得此商品。（
超过5次，显示”很可惜，你没有获得奖品，竞猜结束。”，
在5次内猜对的话，显示”恭喜你，获得了此奖品。”）
 */
public class Hk2 {
	public static void main(String[] args) {
		// 1.顶一个随机数
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int price = random.nextInt(8001) + 2000;
		System.out.println(price);
		int count = 0;// 记录用户错误的次数
		while (true) {
			System.out.println("输入一个价格");
			int userPrice = scanner.nextInt();
			// 输入的价格和实际的价格匹配
			if (userPrice > 10000 || userPrice < 2000) {
				System.out.println("请输入一个2000-10000的价格");
			} else if (userPrice == price) {
				System.out.println("恭喜猜中了");
				break;
			} else {// 猜大了和猜小了其实都是错了一次
				count++;
				if (userPrice > price) {
					System.out.println("猜大了");
				} else {
					System.out.println("猜小了");
				}
				System.out.println("还剩下...." + (5 - count) + "次");
				if (count == 5) {
					System.out.println("猜错了超过5次");
					break;
				}
			}
		}

	}
}
