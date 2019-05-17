/*
从键盘输入一个字符，若为小写字母，则转化为大写字母;
若为大写字母，则转化为小写字母;
否则转化为ASCII码表中的下一个字符。
*/
import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		//1.键盘接收一个字符
		char c = ' ';
		Scanner scanner = new Scanner(System.in);
		//键盘上接受一个字符串
		System.out.println("请输入一个字符");
		String str = scanner.next();//接收字符串，hello
		c = str.charAt(0);//0代表的是取第一个字符
		//2.判断是大小字母或者小写字母，ASCII码，对应有一个int类型的数值
		//字符在做数学运算时，会转换成对应的ASCII值
		if(c >= 'a'  &&  c<= 'z'){//表示小写字母 小写转大写 - 32
			c = (char)(c - 32);//char和int做数学运算首先自动提升，然后赋值给左边的时候需要强转
			// c-=32;不需要强转，自动转换
		}else if(c >= 'A' && c < 'Z'){
			c = (char)(c +32);
		}else{
			c += 1;
		}// if else if结构这里只能满足一个条件
		System.out.println("转换后的字符是......." + c);
	}
}