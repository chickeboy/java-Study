package homeWork3;
/*定义一个接口CanCry，描述会吼叫的方法public void cry()。 （1分）
(2)分别定义狗类（Dog）和猫类（Cat），实现CanCry接口。实现方法的功能分别为：
打印输出“我是狗，我的叫声是汪汪汪”、“我是猫，我的叫声是喵喵喵”。 （1分）
(3)定义一个主类G，  
①定义一个void makeCry(CanCry c)方法，其中让会吼叫的事物吼叫。 
②在main方法中创建狗类对象（dog）、猫类对象（cat）、G类对象（g），用
调用makecry方法，让狗和猫吼叫。*/
public class hk11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		G g = new G(new Dog());
		g.makeCry();
		g = new G(new Cat());
		g.makeCry();
	}

}
class G {
	CanCry canCry;

	public G(CanCry canCry) {
		super();
		this.canCry = canCry;
	}
	public void makeCry() {
		canCry.cry();
	}
}
interface CanCry{
	public void cry();
}
class Dog implements CanCry{

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("我是狗，我的叫声是汪汪汪");
	}
	
}
class Cat implements CanCry{

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("我是猫，我的叫声是喵喵喵");
	}
	
}