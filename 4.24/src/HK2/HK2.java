package HK2;

import java.util.Scanner;

/*2.请定义一个交通工具(Vehicle)的类，其中有:
属性：速度(speed)，体积(size)等等
方法：移动(move())，设置速度(setSpeed(int speed))，加速speedUp(),减速speedDown()等等.
最后在测试类Vehicle中的main()中实例化一个交通工具对象，并通过方法给它初始化speed,size的值，
并且通过打印出来。另外，调用加速，减速的方法对速度进行改变。（类的成员变量）*/
public class HK2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Vehicle car =  new Vehicle();
		car.speed = 0;
		car.size = 5;
		while(true) {
			System.out.println("+加速"+"-减速"+"t退出");
			String str = scanner.next();
			if(str.equals("t")) {
				break;
			}
			car.setSpeed(str);
		}
	}

}
