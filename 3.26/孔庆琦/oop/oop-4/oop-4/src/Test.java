
public class Test {
	public static void main(String[] args) {
		Master master = new Master();
		Pet p1 = new Dog("旺财");
		Pet p2 = new Cat("小花");
		Food f1 = new Bone("骨头");
		Food f2 = new Fish("鱼");
		master.feed(p1, f1);
		master.feed(p1, f2);
		master.feed(p2, f1);
		master.feed(p2, f2);

	}
}
