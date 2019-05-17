
public class FactoryDemo {
	public static void main(String[] args) {
		Ifruit ifruit = Factory.getIfruit("苹果");
		if(ifruit!=null) {
			System.out.println(ifruit.get());
		}else {
			System.out.println("不存在");
		}
	}
}
class Factory{
	public static Ifruit getIfruit(String name) {
		Ifruit ifruit  = null;
		switch (name) {
		case "苹果":
			ifruit =  new Apple();
		case "橘子":
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
		return "采摘苹果";
	}
	
}
class Orange implements Ifruit{

	@Override
	public String get() {
		// TODO Auto-generated method stub
		return "采摘橘子";
	}
	
}
