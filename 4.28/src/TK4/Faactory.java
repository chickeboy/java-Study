package TK4;

public class Faactory {
	private String str;	
	public Phonecards phonecards;
	public Faactory(String str) {
		super();
		this.str = str;
	}

	public void creat() {
		System.out.println("creat方法");
		System.out.println(str);
		switch (str) {
		case "移动卡":
			phonecards = new Mobilecard(str);
		case "联通卡":
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
