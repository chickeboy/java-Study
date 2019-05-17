/*
 * 手机类
 */
public class Mobile {
	private String name;
	private Battery battery;// 表示手机里是可以装电池的，但是现在还没有

	public void setBattery(Battery battery) {
		this.battery = battery;// 将外部传入的电池的引用赋值给成员属性
	}

	// 模拟打电话的过程,这是一个循环的过程
	public void use() {
		while (true) {
			System.out.println("剩余电量.............................." + battery.getBattery());
			if (!battery.use(2)) {// 返回false就是没电了
				// 手机在这里只是调用者，通过给与使用的电量消耗值让电池去完成电量的消耗
				System.out.println("没电了...................");
				break;
			}
		}
	}
	public void changeBattery() {
		battery.change();
	}
}
