package HomeWork2;

public class OutPut2 extends Thread {
	All all ;
	
	public OutPut2(All all) {
		super();
		this.all = all;
	}

	@Override
	public void run() {
		all.number();
	}
}
