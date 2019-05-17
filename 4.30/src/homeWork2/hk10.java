package homeWork2;

/*刘备江东娶妻，赵云容易吗
刘备去江东，诸葛亮事先准备了3个锦囊给予赵云，在关键时候使用。
三个妙计分别是：1.找乔国老帮忙(开后门)
     2.求吴国太放行(诉苦)
     3.孙夫人断后
设计一个程序，模拟赵云使用锦囊的过程
在线答题上传答案上移下移移除设置分值*/
public class hk10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Openkits openkits = new Zhaoyun(new kits1());
		openkits.name();
		openkits = new Zhaoyun(new kits2());
		openkits.name();
		openkits = new Zhaoyun(new kits3());
		openkits.name();
	}

}
interface Open{
	public void open();
}
class kits1 implements Open{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("找乔国老帮忙(开后门)");
	}
	
}
class kits2 implements Open{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("求吴国太放行(诉苦)");
	}
	
}
class kits3 implements Open{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("孙夫人断后");
	}
	
}
abstract class Openkits{
	private Open open;
	public Openkits(Open open) {
		this.open = open;
	}
	public void name() {
		System.out.println("打开了锦囊");
		open.open();
	}
} 
class Zhaoyun extends Openkits{

	public Zhaoyun(Open open) {
		super(open);
		// TODO Auto-generated constructor stub
	}
}