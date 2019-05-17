
public class ZhaoYun {
	private String name;

	public ZhaoYun(String name) {
		super();
		this.name = name;
	}

	// 负责对锦囊进行使用
	public void userIdea(Idea idea) {// 这里其实就是接口的引用传入，具体的实现依靠实现类对象去实现
		// 现在还是未知的，只有在具体传参的时候才会得到不同的展现
		System.out.println(name + "打开了锦囊");
		idea.use();
	}
}
