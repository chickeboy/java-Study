
public class ZhaoYun {
	private String name;

	public ZhaoYun(String name) {
		super();
		this.name = name;
	}

	// ����Խ��ҽ���ʹ��
	public void userIdea(Idea idea) {// ������ʵ���ǽӿڵ����ô��룬�����ʵ������ʵ�������ȥʵ��
		// ���ڻ���δ֪�ģ�ֻ���ھ��崫�ε�ʱ��Ż�õ���ͬ��չ��
		System.out.println(name + "���˽���");
		idea.use();
	}
}
