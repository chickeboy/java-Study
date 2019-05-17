
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
		System.out.println("���ڰ����ݱ������ļ���"+data);
	}
	
}
class NetSave implements ISave{
	@Override
	public void save(String data) {
		// TODO Auto-generated method stub
		System.out.println("���ڰ����ݱ��浽������"+data);
	}
}
abstract class BaseSave{
	private ISave iSave;
	public BaseSave(ISave iSave) {
		super();
		this.iSave = iSave;
	}
	public void add(String data) {
		System.out.println("���ڼ�����ݵĺϷ���");
		iSave.save(data);
		System.out.println("���ݱ������");
		
	}
}
class UserSave extends BaseSave{
	public UserSave(ISave iSave) {
		super(iSave);
		// TODO Auto-generated constructor stub
	}
	
}
