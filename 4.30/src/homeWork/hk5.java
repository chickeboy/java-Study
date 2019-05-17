package homeWork;

/*淘宝上的商品(Goods)种类繁多，有电器类(Elec)，
有服装类(Clothing)。电器类商品都可以充电(IChargeable)，
服装类商品都可以穿戴(IWearable)。
Google眼镜(GoogleGlass)属于电器类，
却既可以充电，也可以穿戴。请根据题目描述创建相应的类、接口，
正确关联它们的关系（继承 or 实现）
在线答题上传答案上移下移移除设置分值*/
public class hk5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoogleGlass glass = new GoogleGlass("GoogleGlass");
		System.out.println(glass.toString());
	}

}
class GoogleGlass implements IChargeable,IWearable{
	private String name;
	
	public GoogleGlass(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String iwString() {
		// TODO Auto-generated method stub
		return "这是一个可充电商品";
	}

	@Override
	public String inchString() {
		// TODO Auto-generated method stub
		return "这是一个可穿商品";
	}

	@Override
	public String toString() {
		return "[name=" + name + "]"+iwString()+inchString();
	}
	
}
class Goods{
	
}
class Elec extends Goods implements IChargeable{

	@Override
	public String inchString() {
		// TODO Auto-generated method stub
		return "这是一个可充电商品";
	}
	
}
class Clothing extends Goods implements IWearable{

	@Override
	public String iwString() {
		// TODO Auto-generated method stub
		return "这是一个可穿商品";
	}
	
}
interface IChargeable{
	public String inchString();
}
interface IWearable{
	public String iwString();
}

