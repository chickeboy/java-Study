package HK2;

/*创建一个类，为该类定义三个构造函数，分别执行下列操作：
  1、传递两个整数值并找出其中较大的一个值
  2、传递三个double值并求出其乘积
  3、传递两个字符串值并检查其是否相同
  4、在main方法中测试构造函数的调用*/
public class HK2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Other other = new Other(2, 4);
		Other other2 = new Other("abc", "abc");
		Other other3 = new Other(3.5, 2.4, 4.5);
		System.out.println(other.toString());
	}

}
