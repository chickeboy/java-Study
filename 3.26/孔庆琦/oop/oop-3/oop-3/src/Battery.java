/*
 * 电池类
 */
public class Battery {
	private double power;

	// 根据不同的调用者我可以获取不同的电量消耗值
	public boolean use(double power) {
		if (power > this.power) {
			this.power = 0;
			return false;// 表示不能再使用
		}
		this.power -= power;// 消耗电量
		return true;
	}
	public double getBattery() {
		return power;
	}
	public void setBattery(double power) {
		this.power = power;
	}
	public void change() { // 表示充电
		power = 100;
	}
}
