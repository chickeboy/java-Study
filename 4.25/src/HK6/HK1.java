package HK6;
/*6.编写简易的学生管理系统，完成以下要求:
(6)学生类：id,name,gender,age,score
(7)菜单类
①注册
②登录
③添加学员
④删除学员
⑤修改学员（修改某一条属性即可）
⑥查看学员信息(主要不要出现null值)*/

import java.util.Scanner;

public class HK1 {
	private static Scanner scanner = new Scanner(System.in);
	private static Root root = new Root();
	private static Manager manager = new Manager();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {//登陆注册界面
			System.out.println("欢迎使用学生信息管理系统！！！");
			System.out.println("1.登陆");
			System.out.println("2.注册");
			System.out.println("3.退出");
			int a = scanner.nextInt();
			switch (a) {
			case 1:
				login();//登陆界面
				break;
			case 2:
				registered();//注册界面
			case 3:
				return;//结束程序
			default:
				break;
			}
		}

	}

	public static void registered() {//注册界面
		System.out.println("===========注册界面===========");
		System.out.println("请输入用户名：");
		String username = scanner.next();
		System.out.println("请输入密码：");
		String password = scanner.next();
		Userinformation userinformation = new Userinformation(username, password);//将输入的username和password传到Userinformation中
		if (root.addroot(userinformation)) {//返还true说明注册成功进入main（）方法
			System.out.println("注册成功");
			main();
		} else {
			System.out.println("注册失败");//返还false不能注册
		}
	}

	public static void login() {//登陆界面
		System.out.println("===========登陆界面===========");
		System.out.println("请输入用户名：");
		String username = scanner.next();
		System.out.println("请输入密码：");
		String password = scanner.next();
		if (root.find(username, password)) {//调用find方法
			System.out.println("登陆成功");//返还true说明注册成功进入main（）方法
			main();
		} else {
			System.out.println("登陆失败");//返还false不能登陆
		}
	}
//下面照抄的   注释我就不写了
	public static void main() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("=======学生管理系统=========");
			System.out.println("1.添加学生");
			System.out.println("2.删除学生");
			System.out.println("3.修改学生");
			System.out.println("4.查看学生");
			System.out.println("5.退出");
			int a = scanner.nextInt();
			switch (a) {
			case 1:
				addMenu();
				break;
			case 2:
				removeByIdMenu();
				break;
			case 3:
				updateMenu();
				break;
			case 4:
				searchAllMenu();
				break;
			case 5:
				return;
			default:
				break;
			}
		}
	}

	public static void searchAllMenu() {
		// TODO Auto-generated method stub
		Student[] stus = manager.getAll();
		Util.show(stus, "所有学生信息");
	}

	public static void updateMenu() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("请输入要修改的学生id");
			int id = scanner.nextInt();
			System.out.println("请输入要修改的name");
			String name = scanner.next();
			Student student = new Student(id, name);
			if (manager.update(id, student)) {
				System.out.println("修改成功");
			} else {
				System.out.println("修改失败");
			}
			if (!Util.isGoOn()) {
				break;
			}
		}
	}

	public static void removeByIdMenu() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("请输入要删除的id");
			int id = scanner.nextInt();
			if (manager.remove(id)) {
				System.out.println("删除成功");
			} else {
				System.out.println("删除失败");
			}
			if (!Util.isGoOn()) {
				break;
			}
		}
	}

	public static void addMenu() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("id");
			int id = scanner.nextInt();
			System.out.println("name");
			String name = scanner.next();
			System.out.println("gender");
			int gender = scanner.nextInt();
			System.out.println("age");
			int age = scanner.nextInt();
			System.out.println("score");
			int score = scanner.nextInt();
			Student student = new Student(id, name, gender, age, score);
			if (manager.save(student)) {
				System.out.println("添加成功");
			} else {
				System.out.println("添加失败");
			}
			if (!Util.isGoOn()) {
				break;
			}
		}
	}

}
