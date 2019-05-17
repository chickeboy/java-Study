package com.example.shopping;

import java.util.Scanner;

//主菜单类
public class Menu {
	private Scanner scanner = new Scanner(System.in);
	private UserManager userManager = new UserManager();
	private GoodsManager goodsManager = new GoodsManager();
	private String username;
	private Time time = new Time();
	private RecordManager recordManager = new RecordManager();
	private int recordId = 0;
	public void mainMenu() {
		// TODO Auto-generated method stub
		System.out.println("============选择登陆类型============");
		System.out.println("1.管理员");
		System.out.println("2.普通用户");
		System.out.println("3.退出");
		int a = scanner.nextInt();
		switch (a) {
		case 1:
			administrator();
			break;
		case 2:
			domesticConsumer();
			break;
		case 3:
			return;
		default:
			break;
		}
	}

	public void administrator() {
		System.out.println("============管理员登陆============");
		System.out.println("账号：");
		String username = scanner.next();
		System.out.println("密码：");
		String password = scanner.next();
		if (username.equals("admin") && password.equals("123456")) {
			System.out.println("管理员登陆成功！");
			administratorMenu();
		} else {
			System.out.println("登陆失败");
			mainMenu();
		}
	}

	public void domesticConsumer() {
		System.out.println("============普通用户============");
		System.out.println("1.注册");
		System.out.println("2.登陆");
		System.out.println("3.退出");
		int a = scanner.nextInt();
		switch (a) {
		case 1:
			domesticConsumerRegistered();
			break;
		case 2:
			domesticConsumerLogin();
			break;
		case 3:
			mainMenu();
		default:
			break;
		}

	}

	public void administratorMenu() {
		System.out.println("=========请选择操作==========");
		System.out.println("1.添加商品");
		System.out.println("2.修改商品");
		System.out.println("3.删除商品");
		System.out.println("4.查询商品");
		System.out.println("5.查询用户信息");
		System.out.println("6.查看商品出售记录表");
		System.out.println("7.退出");// 4.根据name查询，
		// 根据价格排序,根据售出数量排序
		int a = scanner.nextInt();
		switch (a) {
		case 1:
			addGood();
			break;
		case 2:
			change();
			break;
		case 3:
			removeMenu();
			break;
		case 4:
			searchAllMenu();
			break;
		case 5:
			getAllUser();
		case 6:
			salesRecord();
		case 7:
			mainMenu();
		default:
			break;
		}

	}

	private void salesRecord() {
		// TODO Auto-generated method stub
		Record arrayrecord2[] = recordManager.getAll();
		Util.showRecord(arrayrecord2, "全部的购买信息");
		administratorMenu();
	}

	public void domesticConsumerRegistered() {// 注册界面
		System.out.println("===========普通用户注册界面===========");
		System.out.println("请输入id：");
		int userId = scanner.nextInt();
		System.out.println("请输入用户名：");
		String username = scanner.next();
		System.out.println("请输入密码：");
		String password = scanner.next();
		User user = new User(userId, username, password);
		if (userManager.adduser(user)) {// 返还true说明注册成功进入main（）方法
			System.out.println("注册成功");
			this.username = username;
			System.out.println(username);
			domesticConsumerMenu();
		} else {
			System.out.println("注册失败");// 返还false不能注册
			mainMenu();
		}
	}

	public void domesticConsumerLogin() {
		System.out.println("=======普通用户的登陆==========");
		System.out.println("请输入账号");
		String username = scanner.next();
		System.out.println("请输入密码");
		String password = scanner.next();
		if (userManager.find(username, password)) {// 调用find方法
			System.out.println("登陆成功");
			// 返还true说明注册成功进入main（）方法
			this.username = username;
			domesticConsumerMenu();
		} else {
			System.out.println("登陆失败");// 返还false不能登陆
			mainMenu();
		}
	}

	public void domesticConsumerMenu() {
		System.out.println("=========请选择操作==========");
		System.out.println("1.购买商品");
		System.out.println("2.查询商品信息");
		System.out.println("3.充值金额");
		System.out.println("4.查询自己的商品购买记录");
		System.out.println("5.退货");
		System.out.println("6.修改密码");
		System.out.println("7.退出");

		int a = scanner.nextInt();
		switch (a) {
		case 1:
			buyGoods();
		case 2:
			commodityInformation();
		case 3:
			changeMoney();
		case 4:
			myPurchaseRecords();
		case 5:
			returnGoods();
		case 6:
			changePassword();
		case 7:
			mainMenu();
		default:
			break;
		}

	}

	private void returnGoods() {
		// TODO Auto-generated method stub
		System.out.println("请输入要退货的商品名字");
		String goodsname = scanner.next();
		if(recordManager.find(goodsname,username)) {
			System.out.println("退货成功");
			domesticConsumerMenu();
		}
		System.out.println("退货失败");
		domesticConsumerMenu();
	}
	private void myPurchaseRecords() {
		// TODO Auto-generated method stub
		recordManager.findRecord(username);
		Record record[] = recordManager.findRecord(username);
		Util.showRecord(record, "所有物品信息");
		domesticConsumerMenu();
	}

	private void commodityInformation() {
		// TODO Auto-generated method stub
		Goods arraysGoods2[] = goodsManager.getAll();
		Util.showGoods(arraysGoods2, "商品");
		domesticConsumerMenu();
	}

	public void addGood() {
		System.out.println("物品id");
		int id = scanner.nextInt();
		System.out.println("物品名字");
		String name = scanner.next();
		System.out.println("物品价格");
		int price = scanner.nextInt();
		System.out.println("物品数量");
		int count = scanner.nextInt();
		Goods goods = new Goods(id, name, price, count);
		if (goodsManager.save(goods)) {
			System.out.println("添加成功");
			administratorMenu();
		} else {
			System.out.println("添加失败");
			administratorMenu();
		}
	}

	public void change() {
		while (true) {
			System.out.println("请输入要修改的物品id");
			int goodsId = scanner.nextInt();
			System.out.println("你要把商品名改成什么");
			String newGoodsName = scanner.next();
			System.out.println("修改数量：");
			int newCount = scanner.nextInt();
			System.out.println("修改价格：");
			int newPrice = scanner.nextInt();
			Goods goods = new Goods(newGoodsName, newPrice, newCount);
			if (goodsManager.update(goodsId, goods)) {
				System.out.println("修改成功");
				administratorMenu();
			} else {
				System.out.println("修改失败");
				administratorMenu();
			}
		}
	}

	public void searchAllMenu() {
		Goods arraysGoods2[] = goodsManager.getAll();
		Util.showGoods(arraysGoods2, "所有物品信息");
		administratorMenu();
	}

	public void removeMenu() {
		while (true) {
			System.out.println("=====选择删除索引方式=====");
			System.out.println("1.根据id删除");
			System.out.println("2.根据goodsname删除");
			System.out.println("3.返回");
			int a = scanner.nextInt();
			switch (a) {
			case 1:
				removeByIdMenu();
			case 2:
				removeByNameMenu();
			case 3:
				administratorMenu();
			default:
				break;
			}
			/*
			int id = scanner.nextInt();
			if (goodsManager.removeById(id)) {
				System.out.println("删除成功");
				administratorMenu();
			} else {
				System.out.println("删除失败");
				administratorMenu();
			}*/
		}
	}

	public void removeByIdMenu() {
		while (true) {
			System.out.println("请输入要删除的id");
			int id = scanner.nextInt();
			if (goodsManager.removeById(id)) {
				System.out.println("删除成功");
				administratorMenu();
			} else {
				System.out.println("删除失败");
				administratorMenu();
			}
		}
	}

	public void removeByNameMenu() {
		while (true) {
			System.out.println("请输入要删除的goodsname");
			String goodsName = scanner.next();
			if (goodsManager.removeByname(goodsName)) {
				System.out.println("删除成功");
				administratorMenu();
			} else {
				System.out.println("删除失败");
				administratorMenu();
			}
		}
	}

	public void changeMoney() {
		System.out.println("你要充值多少钱");
		int money = scanner.nextInt();
		if (userManager.changeMoney(username, money)) {
			System.out.println("充值成功");
			domesticConsumerMenu();
		} else {
			System.out.println("充值失败");
			domesticConsumerMenu();
		}
	}

	private void getAllUser() {
		// TODO Auto-generated method stub
		User arrays[] = userManager.getAll();
		Util.showUser(arrays, "所有用户信息");
		administratorMenu();
	}

	private void buyGoods() {
		// TODO Auto-generated method stub
		Goods arraysGoods2[] = goodsManager.getAll();
		Util.showGoods(arraysGoods2, "商品");
		System.out.println("请输入要购买的商品id");
		int goosId = scanner.nextInt();
		System.out.println("请输入要购买的数量");
		int count = scanner.nextInt();
		boolean bool = goodsManager.inventory(goosId, count);
		boolean bool1  =userManager.banlance(username,goodsManager.price(goosId));
		if (bool&&bool1) {
			int totalprice = goodsManager.totalPrice(goosId,count);
			goodsManager.outbound(goosId,count);
			String goodsname = goodsManager.goodsName(goosId);
			userManager.deductions(username,totalprice);
			String newtime = time.getTime();
			System.out.println("购买成功");
			recordId++;
			recordData(recordId,goosId,username,goodsname,newtime,totalprice);
			domesticConsumerMenu();
		} else if(bool) {
			System.out.println("余额不足");
			domesticConsumerMenu();
		}else if(bool1) {
			System.out.println("库存不足");
			domesticConsumerMenu();
		}else {
			System.out.println("购买失败");
			domesticConsumerMenu();
		}
	}
	private void recordData(int recordId, int goosId, String username, String goodsname, String newtime,int totalprice) {
		// TODO Auto-generated method stub
		Record record = new Record(recordId, username, goodsname, newtime,totalprice);
		recordManager.save(record);
	}

	private void changePassword() {
		// TODO Auto-generated method stub
		System.out.println("请输入新的密码");
		String newPassWord = scanner.next();
		if (userManager.changePassword(username, newPassWord)){
			System.out.println("修改成功");
			domesticConsumerMenu();
		} else {
			System.out.println("修改失败");
			domesticConsumerMenu();
		}
		
	}
}
