
public class Test {
	public static void main(String[] args) {
		Master master = new Master();
		Pet p1 = new Dog("����");
		Pet p2 = new Cat("С��");
		Food f1 = new Bone("��ͷ");
		Food f2 = new Fish("��");
		master.feed(p1, f1);
		master.feed(p1, f2);
		master.feed(p2, f1);
		master.feed(p2, f2);

	}
}
