/*
 * �ֻ���
 */
public class Mobile {
	private String name;
	private Battery battery;// ��ʾ�ֻ����ǿ���װ��صģ��������ڻ�û��

	public void setBattery(Battery battery) {
		this.battery = battery;// ���ⲿ����ĵ�ص����ø�ֵ����Ա����
	}

	// ģ���绰�Ĺ���,����һ��ѭ���Ĺ���
	public void use() {
		while (true) {
			System.out.println("ʣ�����.............................." + battery.getBattery());
			if (!battery.use(2)) {// ����false����û����
				// �ֻ�������ֻ�ǵ����ߣ�ͨ������ʹ�õĵ�������ֵ�õ��ȥ��ɵ���������
				System.out.println("û����...................");
				break;
			}
		}
	}
	public void changeBattery() {
		battery.change();
	}
}
