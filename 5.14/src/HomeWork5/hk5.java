package HomeWork5;
/*编一个程序，实现两个线程 A 和 B ，A 和 B 同时启动，
A线程每隔5秒显示字符串”AAA”，B线程每隔 1秒显示字符‘B’。*/
public class hk5 {
	public static void main(String[] args) {
		new A().start();
		new B().start();
	}
}
class A extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			
			System.out.println("AAA");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class B extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			
			System.out.println("B");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}