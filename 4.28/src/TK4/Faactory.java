package TK4;

public class Faactory {
	private String str;	
	public Phonecards phonecards;
	public Faactory(String str) {
		super();
		this.str = str;
	}

	public void creat() {
		System.out.println("creat����");
		System.out.println(str);
		switch (str) {
		case "�ƶ���":
			phonecards = new Mobilecard(str);
		case "��ͨ��":
			phonecards = new Unicomcard(str);

		default:
			break;
		}
	}

	public String getName() {
		return str;
	}

	public void setName(String str) {
		this.str = str;
	}
	
}
