/*创建一个Worker ，具有属性name age
创建一个自我介绍的行为，用于输出所有的属性
在main函数中创建对象，调用测试*/
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Woker woker = new Woker();
		woker.name = "张三";
		woker.out(23);
	}

}
class Woker{
	String name;
	public void out(int age) {
		System.out.println(name+age+"岁");
	}
}
