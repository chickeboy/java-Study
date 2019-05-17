package HK1;

public class A {
	int v = 100;
	public boolean gess(int v) {
		boolean bool = false;
		if(this.v < v) {
			System.out.println("大了");
			bool  = false;
		}else if (this.v > v) {
			System.out.println("小了");
			bool = false;
		}else {
			System.out.println("答对了");
			bool = true;
		}
		return bool;
		
	}
}
