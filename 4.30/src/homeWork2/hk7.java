package homeWork2;

/*编写一个程序，模拟以下场景：
现有一块电脑主板，其主板本身已经集成了网卡和声卡功能，但是为了满足市场的需求，
主板上提供了3个PCI接口，提供给用户后期扩展功能使用。
用户可以在PCI接口上插上各种PCI设备，例如可以支持千M网速的独立网卡、
HIFI音质的独立声卡、检测专用的检测卡等。
在线答题上传答案上移下移移除设置分值*/
public class hk7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainBord mainBord = new HIFI();
		mainBord.integratednetworkcard();
		mainBord.integratedsoundcard();
		mainBord.insert();
		mainBord = new Networkcard();
		mainBord.insert();
		mainBord = new detection();
		mainBord.insert();
	}

}
abstract class MainBord implements Pic {
	public void integratednetworkcard() {
		System.out.println("这是集成网卡");
	}
	public void integratedsoundcard() {
		System.out.println("这是集成声卡");
	}
	@Override
	public abstract void insert();	
}
interface Pic{
	void insert();
}
class HIFI extends MainBord{

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("插入了HiFi声卡");
	}
	
}
class Networkcard extends MainBord{

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("插入了千兆网卡");
	}
	
}
class detection extends MainBord{

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("插入了检测卡");
	}
	
}