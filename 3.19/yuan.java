import java.util.*;//导入一个工具包 油条
public class yuan{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);//创建一个用来键盘接收数据的工具对象叫做scanner
		System.out.println("请输入圆的半径");
		//如何保存键盘上输入的内容在缓存中
		int r = scanner.nextInt();//键盘下一个输入的整数
		double v = 4*Math.PI*Math.pow(r,3)/3;
		double s = 3.14*r*r/2;
		double S = 4*3.14*r*r; 
		System.out.println("圆的面积为" + s);
		System.out.println("球的体积为" + v);
		System.out.println("球的面积为" + s);
	}
}