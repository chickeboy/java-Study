import java.util.Scanner;

/*2.现有一个电视商品竞猜活动
活动规则：
随机出现一个电视的价格（2000-10000之间），
用户去竞猜价格，如果在5次内猜对价格，便可获得此商品。
（超过5次，显示”很可惜，你没有获得奖品，竞猜结束。
”，在5次内猜对的话，显示”恭喜你，获得了此奖品。”）*/
public class HK2 {
public static void main(String[] args) {
	int a = (int)Math.floor(Math.random()*8000+2000);
	System.out.println(a);
	Scanner scanner = new Scanner(System.in);
	int i = 0;
	while(true) {
		if(i==5) {
			System.out.println("很可惜，你没有获得奖品，竞猜结束");
			break;
		}
		int b = scanner.nextInt();
		if(a==b) {
			System.out.println("恭喜你，获得了此奖品。");
			break;
		}		
		i++;
	}
}
}
