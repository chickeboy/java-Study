
public class Test {
	public static void main(String[] args) {
		Battery battery = new Battery();
		battery.setBattery(100);
		Mobile mobile = new Mobile();
		mobile.setBattery(battery);// ���װ��صĲ���
		mobile.use();
		mobile.changeBattery();
		mobile.use();
	}
}
