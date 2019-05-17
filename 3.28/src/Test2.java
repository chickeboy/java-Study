public class Test2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Mobile mobile = new Mobile();
        Battery battery = new Battery();
        battery.power = 10;
        mobile.battery = battery;
        mobile.call();
	}
}
class Mobile {
	String name;
	Battery battery;
	public void call() {
		while(true) {
			System.out.println("正在通话中。。。");
			if(battery.use(1) == false) {
				System.out.println("没电了");
				break;
			}else {
				System.out.println("电量" + battery.power);			
			}
		}
	}
}
class Battery {
	String name;
	int power;
	public boolean use(double p) {
		if (p > power) {
			return false;
		} else {
			power = power - 1;
			return true;
		}

	}
}
