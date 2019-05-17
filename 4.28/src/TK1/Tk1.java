package TK1;
/*.创建一个动物类 
具有属性name age
具有行为 
抽象方法play() eat() 
具体方法sleep(){}
提供对应的构造方法，get set方法
并重写equals方法 判断依据是 name 和 age同时相同
创建一个Dog类继承动物类，用有自己的属性 colour
并且实现paly方法，并重写equals  name age colour都相同为同一个对象
再创建大狗和小狗类，继承Dog类，对eat进行实现不同的逻辑
最后再main方法中创建大狗小狗的对象，调用3个方法，并且测试equals的比较结果*/

public class Tk1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog bigDog = new BigDog("嘿嘿", 5, "黑色");
		Dog smallDog = new SmallDog("嘿嘿", 5, "白色");
		System.out.println(bigDog.equals(smallDog));
		Aimal bigAimal = new BigDog("哈哈", 5, "白色"); 
		Aimal bigAima2 = new SmallDog("哈哈", 3, "白色");
		System.out.println(bigAimal.equals(bigAima2));
		SmallDog smallDog2 = new SmallDog("小狗", 2, "黑色");
		BigDog bigDog2 = new BigDog("大狗",5,"白色");
		smallDog2.output();
		bigDog2.output();
	}

}
