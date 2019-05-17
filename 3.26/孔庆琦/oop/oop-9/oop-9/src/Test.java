import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		Person[] p = new Person[5];
		p[0] = new Person("aaaa", 100);
		p[1] = new Person("aaa", 23);
		p[2] = new Person("bbb", 44);
		p[3] = new Person("aab", 55);
		p[4] = new Person("avb", 88);
		// Arrays.sort有一个规定，就是传入的数组有一个要求：要求数组中存放的对象具有可比性
		// 要让sort知道你的可比性是什么规则，那么就要去让数组中存放的类型实现Comparable接口
		// 提供的工具类的方法，很方便，只需要根据它给与的提示和参数的规定，就能得到最后的结果
		// 这里的sort方法其实就是需要我们的compareTo的返回值
		Arrays.sort(p);
		for (Person person : p) {
			System.out.println(person);
		}
		MyCompare compare = new MyCompare();
		Arrays.sort(p, compare);// 方法的重载，传入一个新的比较规则覆盖原有的Person自带的比较规则
		System.out.println("========================");
		for (Person person : p) {
			System.out.println(person);
		}
	}
}
