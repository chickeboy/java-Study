package HK4;

public class MI {
	Battery battery = new Battery(100);
	public int out() {
		return battery.getElectricity();
	}
}
