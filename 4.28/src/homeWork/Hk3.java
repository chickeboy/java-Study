package homeWork;

import java.util.Scanner;

/*设计一个产生女朋友的工厂(对你没有看错是女朋友)，并测试 
要求： 
1：设计BaseGF类，含有抽象无参方法 eat(),普通无参方法shopping(), 
2：三个子类分别继承BaseGF 
3：设计GFFactory类，含有静态方法:BaseGF createGF(String gfType) 
4：设计gfType判断，只能是，四川，广东，山东 
5：测试，分别创建三个类的对象，并调用对象的两个方法 */
public class Hk3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入地方");
		Scanner scanner = new Scanner( System.in);
		String gfType = scanner.next();
		GFFactory gfFactory = new GFFactory();
		BaseGF baseGF = gfFactory.BaseGFcreateGF(gfType);
		if(gfType==null) {
			System.out.println("没有这个地方的妹子");
		}else {
			baseGF.shopping();
			baseGF.eat();
		}
		

	}

}
class GFFactory{
	public static BaseGF BaseGFcreateGF(String gfType) {
		BaseGF baseGF = null;
		switch (gfType) {
		case "四川":
			baseGF = new girl("张三", gfType);
			break;
		case "广东":
			baseGF = new girl("李四", gfType);
			break;
		case "山东":
			baseGF = new girl("王五", gfType);
			break;

		default:
			break;
		}
		return baseGF;
	}
}
abstract class BaseGF{
	private String name;
	private String local;
	public BaseGF(String name, String local) {
		super();
		this.name = name;
		this.local = local;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	abstract void eat();
	public void shopping() {
		// TODO Auto-generated method stub
		System.out.println("和"+getLocal()+"妹子一起买东西");
	}
}
class girl extends BaseGF{

	public girl(String name, String local) {
		super(name, local);
		// TODO Auto-generated constructor stub
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("和"+getName()+"一起吃东西");
	}
	
}
class girl1 extends BaseGF{

	public girl1(String name, String local) {
		super(name, local);
		// TODO Auto-generated constructor stub
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("和"+getName()+"一起吃东西");
	}
	
}
class girl2 extends BaseGF{

	public girl2(String name, String local) {
		super(name, local);
		// TODO Auto-generated constructor stub
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("和"+getName()+"一起吃东西");
	}
	
}