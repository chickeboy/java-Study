package com.example.shopping;

import java.util.Scanner;

//���˵���
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
		System.out.println("============ѡ���½����============");
		System.out.println("1.����Ա");
		System.out.println("2.��ͨ�û�");
		System.out.println("3.�˳�");
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
		System.out.println("============����Ա��½============");
		System.out.println("�˺ţ�");
		String username = scanner.next();
		System.out.println("���룺");
		String password = scanner.next();
		if (username.equals("admin") && password.equals("123456")) {
			System.out.println("����Ա��½�ɹ���");
			administratorMenu();
		} else {
			System.out.println("��½ʧ��");
			mainMenu();
		}
	}

	public void domesticConsumer() {
		System.out.println("============��ͨ�û�============");
		System.out.println("1.ע��");
		System.out.println("2.��½");
		System.out.println("3.�˳�");
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
		System.out.println("=========��ѡ�����==========");
		System.out.println("1.�����Ʒ");
		System.out.println("2.�޸���Ʒ");
		System.out.println("3.ɾ����Ʒ");
		System.out.println("4.��ѯ��Ʒ");
		System.out.println("5.��ѯ�û���Ϣ");
		System.out.println("6.�鿴��Ʒ���ۼ�¼��");
		System.out.println("7.�˳�");// 4.����name��ѯ��
		// ���ݼ۸�����,�����۳���������
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
		Util.showRecord(arrayrecord2, "ȫ���Ĺ�����Ϣ");
		administratorMenu();
	}

	public void domesticConsumerRegistered() {// ע�����
		System.out.println("===========��ͨ�û�ע�����===========");
		System.out.println("������id��");
		int userId = scanner.nextInt();
		System.out.println("�������û�����");
		String username = scanner.next();
		System.out.println("���������룺");
		String password = scanner.next();
		User user = new User(userId, username, password);
		if (userManager.adduser(user)) {// ����true˵��ע��ɹ�����main��������
			System.out.println("ע��ɹ�");
			this.username = username;
			System.out.println(username);
			domesticConsumerMenu();
		} else {
			System.out.println("ע��ʧ��");// ����false����ע��
			mainMenu();
		}
	}

	public void domesticConsumerLogin() {
		System.out.println("=======��ͨ�û��ĵ�½==========");
		System.out.println("�������˺�");
		String username = scanner.next();
		System.out.println("����������");
		String password = scanner.next();
		if (userManager.find(username, password)) {// ����find����
			System.out.println("��½�ɹ�");
			// ����true˵��ע��ɹ�����main��������
			this.username = username;
			domesticConsumerMenu();
		} else {
			System.out.println("��½ʧ��");// ����false���ܵ�½
			mainMenu();
		}
	}

	public void domesticConsumerMenu() {
		System.out.println("=========��ѡ�����==========");
		System.out.println("1.������Ʒ");
		System.out.println("2.��ѯ��Ʒ��Ϣ");
		System.out.println("3.��ֵ���");
		System.out.println("4.��ѯ�Լ�����Ʒ�����¼");
		System.out.println("5.�˻�");
		System.out.println("6.�޸�����");
		System.out.println("7.�˳�");

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
		System.out.println("������Ҫ�˻�����Ʒ����");
		String goodsname = scanner.next();
		if(recordManager.find(goodsname,username)) {
			System.out.println("�˻��ɹ�");
			domesticConsumerMenu();
		}
		System.out.println("�˻�ʧ��");
		domesticConsumerMenu();
	}
	private void myPurchaseRecords() {
		// TODO Auto-generated method stub
		recordManager.findRecord(username);
		Record record[] = recordManager.findRecord(username);
		Util.showRecord(record, "������Ʒ��Ϣ");
		domesticConsumerMenu();
	}

	private void commodityInformation() {
		// TODO Auto-generated method stub
		Goods arraysGoods2[] = goodsManager.getAll();
		Util.showGoods(arraysGoods2, "��Ʒ");
		domesticConsumerMenu();
	}

	public void addGood() {
		System.out.println("��Ʒid");
		int id = scanner.nextInt();
		System.out.println("��Ʒ����");
		String name = scanner.next();
		System.out.println("��Ʒ�۸�");
		int price = scanner.nextInt();
		System.out.println("��Ʒ����");
		int count = scanner.nextInt();
		Goods goods = new Goods(id, name, price, count);
		if (goodsManager.save(goods)) {
			System.out.println("��ӳɹ�");
			administratorMenu();
		} else {
			System.out.println("���ʧ��");
			administratorMenu();
		}
	}

	public void change() {
		while (true) {
			System.out.println("������Ҫ�޸ĵ���Ʒid");
			int goodsId = scanner.nextInt();
			System.out.println("��Ҫ����Ʒ���ĳ�ʲô");
			String newGoodsName = scanner.next();
			System.out.println("�޸�������");
			int newCount = scanner.nextInt();
			System.out.println("�޸ļ۸�");
			int newPrice = scanner.nextInt();
			Goods goods = new Goods(newGoodsName, newPrice, newCount);
			if (goodsManager.update(goodsId, goods)) {
				System.out.println("�޸ĳɹ�");
				administratorMenu();
			} else {
				System.out.println("�޸�ʧ��");
				administratorMenu();
			}
		}
	}

	public void searchAllMenu() {
		Goods arraysGoods2[] = goodsManager.getAll();
		Util.showGoods(arraysGoods2, "������Ʒ��Ϣ");
		administratorMenu();
	}

	public void removeMenu() {
		while (true) {
			System.out.println("=====ѡ��ɾ��������ʽ=====");
			System.out.println("1.����idɾ��");
			System.out.println("2.����goodsnameɾ��");
			System.out.println("3.����");
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
				System.out.println("ɾ���ɹ�");
				administratorMenu();
			} else {
				System.out.println("ɾ��ʧ��");
				administratorMenu();
			}*/
		}
	}

	public void removeByIdMenu() {
		while (true) {
			System.out.println("������Ҫɾ����id");
			int id = scanner.nextInt();
			if (goodsManager.removeById(id)) {
				System.out.println("ɾ���ɹ�");
				administratorMenu();
			} else {
				System.out.println("ɾ��ʧ��");
				administratorMenu();
			}
		}
	}

	public void removeByNameMenu() {
		while (true) {
			System.out.println("������Ҫɾ����goodsname");
			String goodsName = scanner.next();
			if (goodsManager.removeByname(goodsName)) {
				System.out.println("ɾ���ɹ�");
				administratorMenu();
			} else {
				System.out.println("ɾ��ʧ��");
				administratorMenu();
			}
		}
	}

	public void changeMoney() {
		System.out.println("��Ҫ��ֵ����Ǯ");
		int money = scanner.nextInt();
		if (userManager.changeMoney(username, money)) {
			System.out.println("��ֵ�ɹ�");
			domesticConsumerMenu();
		} else {
			System.out.println("��ֵʧ��");
			domesticConsumerMenu();
		}
	}

	private void getAllUser() {
		// TODO Auto-generated method stub
		User arrays[] = userManager.getAll();
		Util.showUser(arrays, "�����û���Ϣ");
		administratorMenu();
	}

	private void buyGoods() {
		// TODO Auto-generated method stub
		Goods arraysGoods2[] = goodsManager.getAll();
		Util.showGoods(arraysGoods2, "��Ʒ");
		System.out.println("������Ҫ�������Ʒid");
		int goosId = scanner.nextInt();
		System.out.println("������Ҫ���������");
		int count = scanner.nextInt();
		boolean bool = goodsManager.inventory(goosId, count);
		boolean bool1  =userManager.banlance(username,goodsManager.price(goosId));
		if (bool&&bool1) {
			int totalprice = goodsManager.totalPrice(goosId,count);
			goodsManager.outbound(goosId,count);
			String goodsname = goodsManager.goodsName(goosId);
			userManager.deductions(username,totalprice);
			String newtime = time.getTime();
			System.out.println("����ɹ�");
			recordId++;
			recordData(recordId,goosId,username,goodsname,newtime,totalprice);
			domesticConsumerMenu();
		} else if(bool) {
			System.out.println("����");
			domesticConsumerMenu();
		}else if(bool1) {
			System.out.println("��治��");
			domesticConsumerMenu();
		}else {
			System.out.println("����ʧ��");
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
		System.out.println("�������µ�����");
		String newPassWord = scanner.next();
		if (userManager.changePassword(username, newPassWord)){
			System.out.println("�޸ĳɹ�");
			domesticConsumerMenu();
		} else {
			System.out.println("�޸�ʧ��");
			domesticConsumerMenu();
		}
		
	}
}
