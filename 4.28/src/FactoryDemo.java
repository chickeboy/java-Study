
public class FactoryDemo {
	public static void main(String[] args) {
		Ifruit ifruit = Factory.getIfruit("ƻ��");
		if(ifruit!=null) {
			System.out.println(ifruit.get());
		}else {
			System.out.println("������");
		}
	}
}
class Factory{
	public static Ifruit getIfruit(String name) {
		Ifruit ifruit  = null;
		switch (name) {
		case "ƻ��":
			ifruit =  new Apple();
		case "����":
			ifruit =  new Orange();
			
		}
		return ifruit;
	}
}
interface Ifruit{
	public String  get();
}
class Apple implements Ifruit{

	@Override
	public String get() {
		// TODO Auto-generated method stub
		return "��ժƻ��";
	}
	
}
class Orange implements Ifruit{

	@Override
	public String get() {
		// TODO Auto-generated method stub
		return "��ժ����";
	}
	
}
