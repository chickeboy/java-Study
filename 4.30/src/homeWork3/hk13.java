package homeWork3;

import java.util.Scanner;

/*一个运输公司从网上得到订单，
 * 订单上标有货物重量和运输里程，
 * 该公司可以使用3种运输工具：卡车、火车、飞机。
 * 编写运输接口，声明3个接口常量，表示运输工具，
 * 声明一个计算运费的方法，参数是重量和里程。

卡车、火车、飞机分别实现运输接口，计算运费的方法如下：
提示：飞机常量public static final int TRUCK=1
 运输方法：public double cost(double weight,double space);
编写测试类，在命令行中输入重量、距离，main方法中使用运输接口和实现类，通过多态计算出每种工具的运费*/
public class hk13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入重量");
		double a = scanner.nextDouble();
		System.out.println("请输入 距离");
		double b = scanner.nextDouble();
		compare compare = new compare(new truck());
		compare.out(a, b);
		compare  = new compare(new train());
		compare.out( a, b);
		compare = new compare(new plane());
		compare.out(a, b);
	}

}
interface Transport {
	int truck = 1;
	int train = 2;
	int plane = 3;
	public double cost(double weight, double space);
}

class compare {
	private Transport transport;

	public compare(Transport transport) {
		super();
		this.transport = transport;
	}
	public void out(double weight,double space) {
		if(transport.cost(weight, space)!=-1) {
			System.out.println(transport.cost(weight, space));
		}else {
			System.out.println("拒载");
		}
	}
}

class truck implements Transport {
	@Override
	public double cost(double weight, double space) {
		// TODO Auto-generated method stub
		if (space < 1000) {
			return weight * space * 120;
		} else {
			return -1;
		}
	}

}

class train implements Transport {
	@Override
	public double cost(double weight, double space) {
		// TODOAuto-generated method stub
		// 火车：当距离在900km内，运费=重量*距离*250，大于900km时，运费=重量*距离*300
		if (space < 900) {
			return weight *space * 250;
		} else {
			return weight * space * 300;
		}

	}
}

class plane implements Transport {

	@Override
	public double cost(double weight, double space) {
		// TODO Auto-generated method stub
		// * 飞机：当距离大于500km时，运费=重量*距离*750，否则拒载，返回-1
		if(space>500) {
			return space*weight*750;
		}else {
			return -1;
		}	
	}
}
