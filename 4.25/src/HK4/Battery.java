package HK4;

public class Battery {
	private int electricity;
	public Battery(int electricity) {
		super();
		this.electricity = electricity;
	}

	public int getElectricity() {
		return electricity--;
	}
}
