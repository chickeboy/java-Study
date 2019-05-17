import java.util.Scanner;

/*3.完成购买商品结算功能：
循环输入商品编号和购物数量，计算消费金额并累加到总金额
输入“n”开始结账（假设享8折）
输入实付金额，计算找零*/
public class HK3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("=======奸商小商品=======");
		System.out.println("铅笔                       25元");
		System.out.println("橡皮                       15元");
		System.out.println("钢笔                       200元");
		double sum = 0;
		while (true) {
			System.out.println("请输入你想要的商品以");
			String str = scanner.next();
			char ch = str.charAt(0);
			if (ch!='n') {
				System.out.println("请输入你想要的数量");
				int b = scanner.nextInt();
				if (str.equals("铅笔")) {
					sum = sum + b * 25;
				} else if (str.equals("橡皮")) {
					sum = sum + b * 15;
				} else if (str.equals("钢笔")) {
					sum = sum + b * 200;
				}
			}else {
				sum = sum * 0.8;
				System.out.println("收银，给钱！！");
				double c = scanner.nextDouble();
				System.out.println("实际收你" + c + "元");
				System.out.println("找零" + (c - sum));
				break;
			}
		}
	}
}
