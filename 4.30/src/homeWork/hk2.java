package homeWork;

/*设计一个台灯类Lamp其中台灯有灯泡这个属性
  还有开灯(on)这个方法，设计一个灯泡类 其中有红灯泡(RedBuble)
  和绿灯泡(GreenBuble) 他们都有一个发亮的方法
  请设计出一段代码可以使台灯开启灯泡发亮，并且
保证替换不同种类的灯泡 台灯类代码不被修改*/
public class hk2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
class Lamp{
	private String bubleString;
	public Lamp(String bubleString) {
		super();
		this.bubleString = bubleString;
	}
	public String getBubleString() {
		return bubleString;
	}
	public void setBubleString(String bubleString) {
		this.bubleString = bubleString;
	}
	public void on() {
		System.out.println("开启台灯");
	}
}