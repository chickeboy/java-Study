package hk6;

/*
 * 现有一块电脑主板，
 * 其主板本身已经集成了网卡和声卡功能，
 * 但是为了满足市场的需求，主板上提供了3个PCI接口，
 * 提供给用户后期扩展功能使用。
 * 用户可以在PCI接口上插上各种PCI设备，
 * 例如可以支持千M网速的独立网卡HIFI音质的独立声卡、
 *检测专用的检测卡等。
 */
public class Hk6 {
	public static void main(String[] args) {
		PCI1 pci1 = new InterCard();
		PCI2 pci2 = new AudioCard();
		PCI3 pci3 = new TestCard();
		Cpu cpu = new Cpu(pci1, pci2, pci3);
		cpu.show();
	}
}

interface PCI1 {
	public void cha();
}

interface PCI2 {
	public void cha();
}

interface PCI3 {
	public void cha();
}

class InterCard implements PCI1 {
	@Override
	public void cha() {
		System.out.println("插入网卡");
	}
}

class AudioCard implements PCI2 {

	@Override
	public void cha() {
		System.out.println("插入声卡");
	}

}

class TestCard implements PCI3 {

	@Override
	public void cha() {
		System.out.println("插入检测卡");
	}

}

class Cpu {
	private InterCard iCard = new InterCard();
	private AudioCard aCard = new AudioCard();
	private PCI1 pci1;
	private PCI2 pci2;
	private PCI3 pci3;

	public Cpu(PCI1 pci1, PCI2 pci2, PCI3 pci3) {
		super();

		this.pci1 = pci1;
		this.pci2 = pci2;
		this.pci3 = pci3;
	}

	public void show() {
		iCard.cha();
		aCard.cha();
		pci1.cha();
		pci2.cha();
		pci3.cha();
	}
}
