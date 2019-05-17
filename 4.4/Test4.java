/*
	
*/
public class Test4{
	public static void main(String[] args){
		char c = 'a';
		//字符在计算机底层是以整数类型显示的
		//字符在做数学运算的时候会自动提升成整数类型
		//对应的值是字符对应的Ascii码表中的数值
		//或者unicode码中的数值
		int i = c;
		System.out.println(c + c);//97 + 97
		double d = c;//char - > int > double
		System.out.println(d);
		System.out.println((double)30);
		System.out.println((int)'孔');
		System.out.println((char)2);
		//System.out.println(int(false));错误
		//单纯的对数据最改变就要强制转换
	}
}


