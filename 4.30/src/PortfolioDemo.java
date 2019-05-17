
public class PortfolioDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseSave baseSave = new UserSave(new FileSave());
		baseSave.add("user");
		baseSave = new UserSave(new NetSave());
		baseSave.add("user");
		
		
	}

}
interface ISave{
	public void save(String data);
}
class FileSave implements ISave{

	@Override
	public void save(String data) {
		// TODO Auto-generated method stub
		System.out.println("正在把数据保存在文件中"+data);
	}
	
}
class NetSave implements ISave{
	@Override
	public void save(String data) {
		// TODO Auto-generated method stub
		System.out.println("正在把数据保存到网络上"+data);
	}
}
abstract class BaseSave{
	private ISave iSave;
	public BaseSave(ISave iSave) {
		super();
		this.iSave = iSave;
	}
	public void add(String data) {
		System.out.println("正在检查数据的合法性");
		iSave.save(data);
		System.out.println("数据保存完毕");
		
	}
}
class UserSave extends BaseSave{
	public UserSave(ISave iSave) {
		super(iSave);
		// TODO Auto-generated constructor stub
	}
	
}
