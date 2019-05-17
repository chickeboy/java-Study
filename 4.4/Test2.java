public class Test2{
	public static void main(String[] args){
		/*
			基本数据类型
			1.为什么要划分数据类型
			针对不同的数据给出相应的数据类型
			可以节约内存
			2.基本数据类型就是系统自带的一些
			数据类型 一共有8种
			整数型
			byte	字节型
			short	短整型
			int		整型			
			long	长整型
			字符型
			char	''中只能放一个字符
			浮点型
			float	单精度浮点
			double	双精度浮点
			布尔型
			一般用在判断	
			boolean		true false
			常量:不可改变的值	9	9.5  '中' false
			变量:可以改变的值,一块拥有名字的内存
			在使用变量之前必须向计算机申请内存
		*/
		//各种基本数据类型的申请方式
		//数据类型	变量名	= 	常量值
		int i = 0;//变量的定义 变量的初始化
		byte bt = 0;
		short s = 0;
		long l = 0l;
		float f = 0.0f;
		double d = 0.0;
		char c = ' ';
		boolean b = false;
		String str = null;
		System.out.println(i);
		int x  =  3;
		int y  =  4;
		x = y;//变量在左边和在右边分别代表着什么
		bt = (byte)i;//int -> byte
		//数据类型较大的数据赋值给数据类型较小的变量
		//需要强制转换(显示转换)
		//变量在左边代表内存	在右边代表常量值
		//数据类型决定了数据所占内存空间的大小和精度还有取值范围
		i = bt;//byte -> int 小转大 无需强制转换，自动提升
		bt = (byte)128;//超出了byte的取值范围
		System.out.println(bt);//-128
	}

}

