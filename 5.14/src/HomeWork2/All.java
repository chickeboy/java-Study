package HomeWork2;

public class All {
	Object object = new Object();
	int i=0;
	public  void showAZ(char a) {
		
		if (i==1) {
			i=0;
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(a);
		i++;
		notify();
		
	}

	public  void showNumber(int a) {
		if (i==2) {
			i=0;
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(a);
		i++;
		notify();
		
	}
	public synchronized void aZ() {
		for (char a = 'A'; a<='Z'; a++) {
			showAZ(a);
		}
	}
	public synchronized void number() {
		for (int a = 1;a<=52;a++) {
			showNumber(a);
		}
	}
}
