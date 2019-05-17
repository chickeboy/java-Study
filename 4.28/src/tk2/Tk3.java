package tk2;

import java.util.Scanner;

/*
 * 多态和抽象类的结合使用
 * 多态：有父类作为参数出现的地方一定可以用
 * 子类的对象去代替
 * 有父类作为返回值的地方可以通过返回子类的对象
 * 去进行多态的展现
 * 工厂模式:对一个对象的创建细节进行封装，调用者只需要传入
 * 你要创建的对象的类名的字符串，就可以获取这个类所属的对象
 * 女娲造人
 * 炉子烤糊了 黑人
 * 炉子没烤熟 白人
 * 烤的最完美的 黄种人
 */
public class Tk3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请问你要什么人种");
		String name = scanner.next();
		HumanFactory factory = new HumanFactory();
		NvWa nvWa = new NvWa(factory);
		Human human = nvWa.create(name);// 返回子类的对象
		if (human == null) {
			System.out.println("没有这个人种");
		} else {
			human.showSelf();
			human.talk();
		}
	}
}

//调用者
class NvWa {
	public HumanFactory factory;

	public NvWa(HumanFactory factory) {
		super();
		this.factory = factory;
	}

	public Human create(String name) {
		return factory.createHuman(name);
	}
}

//炉子 工厂
class HumanFactory {
	public Human createHuman(String name) {
		Human human = null;// 创建的是父类的引用
		switch (name) {
		case "黑人":
			human = new BlackHuman(name, "黑色");
			break;
		case "白人":
			human = new WhiteHuman(name, "白色");
			break;
		case "黄种人":
			human = new YellowHuman(name, "黄色");
			break;
		default:
			break;
		}
		return human;
	}
}

abstract class Human {
	private String name;
	private String colour;

	public Human(String name, String colour) {
		super();
		this.name = name;
		this.colour = colour;
	}

	// 未知的行为等待子类去实现
	public abstract void talk();

	public abstract void showSelf();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}

class WhiteHuman extends Human {

	public WhiteHuman(String name, String colour) {
		super(name, colour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void talk() {
		System.out.println(getName() + "hello");
	}

	@Override
	public void showSelf() {
		System.out.println(getName() + getColour() + "老了就皱巴巴的");
	}

}

class YellowHuman extends Human {

	public YellowHuman(String name, String colour) {
		super(name, colour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void talk() {
		System.out.println(getName() + "说汉语");
	}

	@Override
	public void showSelf() {
		System.out.println(getName() + getColour() + "我的皮肤很细致");
	}

}

class BlackHuman extends Human {

	public BlackHuman(String name, String colour) {
		super(name, colour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void talk() {
		System.out.println(getName() + "物理物理无敌wid");
	}

	@Override
	public void showSelf() {
		System.out.println(getName() + getColour() + "你看不见我");
	}

}
