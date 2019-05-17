import java.util.Scanner;//用来接收键盘数据的工具类
public class Test5{
	public static void main(String[] args){
		//8种基本数据类型的录入方式,有录入的地方必须有输出
		//提示用户输入的数据到底起什么作用
		//1.创建一个Scanner扫描类库创建的工具对象
		Scanner scanner = new Scanner(System.in);
		//命名变量要有意义，英文单词(拼音)不要以数字，符号命名
		//变量的首字母小写，后续的单词首字母大写
		int i = 0;
		System.out.println("请输入一个整数");
		i = scanner.nextInt();//接收下一个输入的整数
		System.out.println("你输入的整数是i = " + i);
		//字符串的拼接,字符串中写的是什么输出的就是什么
		//String 和其他数据类型做+会吸收所有的数据类型
		//最终结果是String
		System.out.println("请输入一个byte");
		byte bt = 0;
		bt = scanner.nextByte();//接收下一个输入的byte
		System.out.println("你输入的byte是byte = " + bt);
		System.out.println("请输入一个short");
		short s = 0;
		s = scanner.nextShort();//接收下一个输入的short
		System.out.println("你输入的short是short = " + s);
		System.out.println("请输入一个byte");
		long l = 0;
		l = scanner.nextLong();//接收下一个输入的long
		System.out.println("你输入的long是long= " + l);
		System.out.println("请输入一个float");
		float f = 0;
		f = scanner.nextFloat();//接收下一个输入的float
		System.out.println("你输入的float是float = " + f);
		System.out.println("请输入一个double");
		double d = 0;
		d = scanner.nextDouble();//接收下一个输入的double
		System.out.println("你输入的double是double = " + d);
		System.out.println("请输入一个byte");
		boolean b = false;
		b = scanner.nextBoolean();//接收下一个输入的boolean
		System.out.println("你输入的整数是boolean = " + b);
		String str = null;
		System.out.println("请输入一个字符串");
		str = scanner.next();
		System.out.println("你输入的字符串是" + str);
		
	
	}
}