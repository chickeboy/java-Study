package Lamaba;

public class LamabaDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method method = (a,b)->a+b;
		System.out.println(method.getsum(2, 3));
		Method method2 = (a,b)->{return a+b;};
		System.out.println(method2.getsum(5, 6));
	}

}
interface Method{
	public int getsum(int a,int b);
}