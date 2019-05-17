
public class Test {
	public static void main(String[] args) {
		ZhaoYun yun = new ZhaoYun("утвсаЗ");
		Idea idea = new FindMrQiao();
		yun.userIdea(idea);
		idea = new FindMissWu();
		yun.userIdea(idea);
		idea = new FindWifeSun();
		yun.userIdea(idea);
	}
}
