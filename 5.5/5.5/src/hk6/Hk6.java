package hk6;

/*
 * ����һ��������壬
 * �����屾���Ѿ��������������������ܣ�
 * ����Ϊ�������г��������������ṩ��3��PCI�ӿڣ�
 * �ṩ���û�������չ����ʹ�á�
 * �û�������PCI�ӿ��ϲ��ϸ���PCI�豸��
 * �������֧��ǧM���ٵĶ�������HIFI���ʵĶ���������
 *���ר�õļ�⿨�ȡ�
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
		System.out.println("��������");
	}
}

class AudioCard implements PCI2 {

	@Override
	public void cha() {
		System.out.println("��������");
	}

}

class TestCard implements PCI3 {

	@Override
	public void cha() {
		System.out.println("�����⿨");
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
