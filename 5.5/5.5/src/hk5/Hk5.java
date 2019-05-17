package hk5;

/*
 * 淘宝上的商品(Goods)种类繁多，
 * 有电器类(Elec)，有服装类(Clothing)。
 * 电器类商品都可以充电(IChargeable)，
 * 服装类商品都可以穿戴(IWearable)。
 * Google眼镜(GoogleGlass)属于电器类，
 * 却既可以充电，也可以穿戴。请根据题目描述创建相应的类、
 * 接口，正确关联它们的关系（继承 or 实现）
 */
public class Hk5 {
	public static void main(String[] args) {
		GoogleGlass glass = new GoogleGlass("谷歌眼镜");
		glass.charge();
		glass.wear();
	}
}

class Goods {
	public String name;

	public Goods(String name) {
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

interface IChargeable {
	public void charge();
}

interface IWearable {
	public void wear();
}

class Clothing extends Goods implements IWearable {

	public Clothing(String name) {
		super(name);
	}

	@Override
	public void wear() {
		System.out.println(getName() + "可以穿");
	}

}

class Elec extends Goods implements IChargeable {

	public Elec(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void charge() {
		System.out.println(getName() + "可以充电");
	}
}

class GoogleGlass extends Elec implements IWearable {

	public GoogleGlass(String name) {
		super(name);
	}

	@Override
	public void wear() {
		System.out.println(getName() + "可以穿戴");
	}

}