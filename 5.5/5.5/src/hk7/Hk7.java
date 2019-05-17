package hk7;

/*
刘备江东娶妻，赵云容易吗
刘备去江东，诸葛亮事先准备了3个锦囊给予赵云，在关键时候使用。
三个妙计分别是：1.找乔国老帮忙(开后门)
     2.求吴国太放行(诉苦)
     3.孙夫人断后
设计一个程序，模拟赵云使用锦囊的过程
 */
public class Hk7 {
	public static void main(String[] args) {
		ZhaoYun yun = new ZhaoYun();
		Idea idea = new OpenBackDoor();
		yun.use(idea);
		idea = new SayPoor();
		yun.use(idea);
		idea = new BreakBack();
		yun.use(idea);
	}
}

class ZhaoYun {
	public void use(Idea idea) {
		System.out.println("赵云打开锦囊");
		idea.open();
	}
}

interface Idea {
	public void open();
}

class OpenBackDoor implements Idea {

	@Override
	public void open() {
		System.out.println("开后门");
	}

}

class SayPoor implements Idea {

	@Override
	public void open() {
		System.out.println("诉苦");
	}

}

class BreakBack implements Idea {

	@Override
	public void open() {
		System.out.println("断后");
	}

}