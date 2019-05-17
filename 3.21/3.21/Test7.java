public class Test7{
	public static void main(String[] args){
		//如何使两个变量交换值
		int a = 3;
		int b = 4;
		//1.小学生写法
		a = a + b;// a = 7
		b = a - b;//b = 7 - 4 = 3
		a = a - b;//a =  7 - 3 = 4
		//2.使用第三方变量进行交换
		int temp = a;
		a = b;
		b = temp;
	}
}