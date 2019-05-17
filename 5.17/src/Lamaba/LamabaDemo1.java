package Lamaba;

public class LamabaDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Massage massage =()->System.out.println("1");
		massage.say();
	}

}
interface Massage{
	public void say();
}