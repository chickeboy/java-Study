package homeWork2;

/*��дһ������ģ�����³�����
����һ��������壬�����屾���Ѿ��������������������ܣ�����Ϊ�������г�������
�������ṩ��3��PCI�ӿڣ��ṩ���û�������չ����ʹ�á�
�û�������PCI�ӿ��ϲ��ϸ���PCI�豸���������֧��ǧM���ٵĶ���������
HIFI���ʵĶ������������ר�õļ�⿨�ȡ�
���ߴ����ϴ������������Ƴ����÷�ֵ*/
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
		System.out.println("���Ǽ�������");
	}
	public void integratedsoundcard() {
		System.out.println("���Ǽ�������");
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
		System.out.println("������HiFi����");
	}
	
}
class Networkcard extends MainBord{

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("������ǧ������");
	}
	
}
class detection extends MainBord{

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("�����˼�⿨");
	}
	
}