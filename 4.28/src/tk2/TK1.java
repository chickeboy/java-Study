package TK2;
/* 张三可以开关家里的任何电器，比如电灯、电视、电扇等。使用继承和多态来实现开关电器的方法。（使用抽象方式）*/

public class TK1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electricalappliances electricalappliances = new Light("电灯", "开启");
		Person person = new Person("张三");
		person.change(electricalappliances);
	}
}
