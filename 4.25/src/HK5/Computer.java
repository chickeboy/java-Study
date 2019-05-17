package HK5;

public class Computer {
	static int price;
	static String name = "msi";
	public static void main(String[] args) {
		Graphicscard graphicscard = new Graphicscard(5000, "GeForceRTX™2080Ti");
		Soundcard soundcard = new Soundcard(369, "华硕Xonar D-Kara ");
		Cpu cpu = new Cpu(7000, "Inteli9-9900k");
		price = graphicscard.getPrice()+soundcard.getPrice()+cpu.getPrice();
		System.out.println("===========配置单===========");
		System.out.println("电脑牌子" +"\t"+ name);
		System.out.println("显卡："+graphicscard.getName() +"\t"+"价格:" +graphicscard.getPrice());
		System.out.println("声卡："+soundcard.getName() +"\t"+"价格:" +soundcard.getPrice());
		System.out.println("CPU："+cpu.getName() +"\t"+"价格:" +cpu.getPrice());
		System.out.println("总价"+"\t"+price);
		
	}

}
