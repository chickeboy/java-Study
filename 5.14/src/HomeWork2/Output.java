package HomeWork2;

public class Output extends Thread {
	All all ;
	
	public Output(All all) {
		super();
		this.all = all;
	}

	@Override
	public void run() {
		all.aZ();
	}
}
