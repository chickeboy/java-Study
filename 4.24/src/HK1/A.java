package HK1;

public class A {
	int v = 100;
	public boolean gess(int v) {
		boolean bool = false;
		if(this.v < v) {
			System.out.println("����");
			bool  = false;
		}else if (this.v > v) {
			System.out.println("С��");
			bool = false;
		}else {
			System.out.println("�����");
			bool = true;
		}
		return bool;
		
	}
}
