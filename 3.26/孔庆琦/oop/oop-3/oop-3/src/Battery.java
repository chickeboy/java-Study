/*
 * �����
 */
public class Battery {
	private double power;

	// ���ݲ�ͬ�ĵ������ҿ��Ի�ȡ��ͬ�ĵ�������ֵ
	public boolean use(double power) {
		if (power > this.power) {
			this.power = 0;
			return false;// ��ʾ������ʹ��
		}
		this.power -= power;// ���ĵ���
		return true;
	}
	public double getBattery() {
		return power;
	}
	public void setBattery(double power) {
		this.power = power;
	}
	public void change() { // ��ʾ���
		power = 100;
	}
}
