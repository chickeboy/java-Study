package hk1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*创建一个动物类，具有属性name,age 
写一个狗类，继承于动物类，具有特有属性 colour,要求 
创建一个HASHSET泛型是动物类型，键盘录入5条狗的对象 
其中有2条狗为重复，重复的判断依据就是 名字和颜色相同就是同一条狗 
最后输出4条狗的信息。 */
public class hk1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Dog> dogs = new HashSet<Dog>();
		System.out.println(dogs.add(new Dog("aa", "black")));
		System.out.println(dogs.add(new Dog("bb", "white")));
		System.out.println(dogs.add(new Dog("acc", "black")));
		System.out.println(dogs.add(new Dog("bbv", "white")));
		System.out.println(dogs.add(new Dog("aa", "black")));
		for (Iterator iterator = dogs.iterator(); iterator.hasNext();) {
			Dog dog = (Dog) iterator.next();
			System.out.println(dog);
		}
	}

}
