package hk2;

/*
 * 使用接口
设计一个台灯类Lamp其中台灯有灯泡这个属性
  还有开灯(on)这个方法，设计一个灯泡类 其中有红灯泡(RedBuble)
  和绿灯泡(GreenBuble) 他们都有一个发亮的方法
  请设计出一段代码可以使台灯开启灯泡发亮，并且
  保证替换不同种类的灯泡 台灯类代码不被修改
 */
public class Hk2 {
	public static void main(String[] args) {
		Buble buble = new GreenBuble("绿灯泡");
		Lamp lamp = new Lamp(buble);
		lamp.on();
		buble = new RedBuble("红灯泡");
		lamp.setBuble(buble);
		lamp.on();

	}
}

interface On {
	public void on();
}

abstract class Buble implements On {
	private String name;

	public Buble(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class GreenBuble extends Buble {

	public GreenBuble(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void on() {
		System.out.println(getName() + "发绿光");
	}

}

class RedBuble extends Buble {

	public RedBuble(String name) {
		super(name);
	}

	@Override
	public void on() {
		System.out.println(getName() + "发红光");
	}

}

class Lamp {
	private Buble buble;

	public Lamp(Buble buble) {
		super();
		this.buble = buble;
	}

	public void on() {
		System.out.println("打开灯");
		buble.on();
	}

	public Buble getBuble() {
		return buble;
	}

	public void setBuble(Buble buble) {
		this.buble = buble;
	}

}
