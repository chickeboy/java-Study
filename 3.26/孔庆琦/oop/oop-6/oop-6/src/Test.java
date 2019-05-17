
public class Test {
	public static void main(String[] args) {
		//比较2个对象是否相同
		Employee employee1 = new Employee("a", 2, "n", "宝宝");
		Employee employee2 = new Employee("a", 2, "n", "宝宝");
		System.out.println(employee1==employee2);//这里比较的其实是2个对象的引用指向是否相同
		System.out.println(employee1.equals(employee2));//其实这里默认调用object的equals方法的话比较的还是==
	}
}
