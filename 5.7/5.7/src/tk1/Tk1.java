package tk1;

/*
 * 包装类
 * 将基本数据类型常量值封装在引用数据类型的对象中
 * 提供额外的方法
 * 拆箱，装箱
 */
public class Tk1 {
	public static void main(String[] args) {
		int a = 3;
		// 手动装箱
		Integer it = new Integer(a);// 将a带的常量值复制到了it中
		// 自动装箱
		Integer i = a;// new Integer(a);
		int b = it.intValue();// 将引用数据类型中存放的常量值通过intValue方法进行返回
		b = it;// 自动拆箱
		System.out.println(it);
		Byte bt = 3;
		Short st = 3;
		Long l = 3L;
		Float f = 3.4f;
		Double d = 3.3;
		Boolean bb = false;
		Integer ig = 3;
		Character cact = 'f';
	}
}
