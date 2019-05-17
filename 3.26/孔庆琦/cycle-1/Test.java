/*
问题描述
现有一个电视商品竞猜活动,活动规则：
随机出现一个电视的价格（2000-10000之间），
用户去竞猜价格，如果在5次内猜对价格，
便可获得此商品。（超过5次，显示”很可惜，你没有获得奖品，竞猜结束。”
在5次内猜对的话，显示”恭喜你，获得了此奖品。”）。

*/
import java.util.*;//表示util下所有的工具
public class Test{
	public static void main(String[] args){
		int price = 0;
		Random random = new Random();// 随机数工具
		price = 2000 + random.nextInt(8001);// 这里的参数表示了随机数的范围0 - ?
		// 这里的参数值 遵循了左臂右开的原则 随机数>=0 && <参数
		Scanner scanner = new Scanner(System.in);
		int userPrice = 0;//用户输入的价格
		System.out.println(price);
		for(int i = 0; i < 5;i++){
			System.out.println("请输入一个价格,请输入2000-10000的价格");
			userPrice = scanner.nextInt();//每次用户输入的值都会覆盖原来的变量中保存的值
			if(userPrice > 10000 || userPrice < 2000){//要把不需要或者特殊的情况范围写在开头
				System.out.println("输入的价格不在范围内");
			}else if(userPrice == price){
				System.out.println("恭喜恭喜,中奖啦");//中奖后应该跳出循环游戏结束
				break;//跳出
			}else{
				System.out.println("不好意思这次没有中奖");
			}
			if(i == 4){//这里4表示循环其实已经是猜过5次了
					System.out.println("抱歉，猜错5次了，游戏结束了");
			}
		}
	}
}