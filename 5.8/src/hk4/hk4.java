package hk4;

import java.util.Scanner;

/*  创建购物车实体类，模拟购物车功能
需求：
1)         添加商品到购物车（输入商品的编号和数量）
2)         删除商品（删除购物车中的指定购物项）
3)         修改商品（修改商品的数量）
4)         显示所购买的商品信息（按购买商品的总价进行升序显示）*/
public class hk4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shoppingcar shoppingcar = new Shoppingcar();
		while (true) {
			System.out.println("===========购物系统==============");
			System.out.println("1.添加商品到购物车");
			System.out.println("2.删除商品");
			System.out.println("3.修改商品");
			System.out.println("4.显示购买的商品信息");
			System.out.println("5.退出");
			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			switch (a) {
			case 1:
				shoppingcar.sjopping();
				break;
			case 2:
				shoppingcar.remove();
				break;
			case 3:
				shoppingcar.modify();
				break;
			case 4:
				shoppingcar.show();
				break;
			case 5:
				break;				
			default:
				break;
			}
		}
	}

}
