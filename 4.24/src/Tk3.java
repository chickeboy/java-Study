/*
 *创建一个Animal类，具有属性name
  age,要求创建一个对象，给予属性赋值
    然后打印输出，再修改成员属性值，输出 
 */
public class Tk3 {
	public static void main(String[] args) {
		Animal1 animal = new Animal1();
		animal.name = "ak";
		System.out.println(animal.name);
		animal.name = "kk";
		System.out.println(animal.name);
	}
}

class Animal1 {
	String name;
	int age;

}
