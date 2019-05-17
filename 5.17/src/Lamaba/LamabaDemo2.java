package Lamaba;

public class LamabaDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetManager getManager = number->number+1;
		System.out.println(getManager.number(8));
	}
}
interface GetManager{
	public int number(int number);
}