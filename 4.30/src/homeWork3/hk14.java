package homeWork3;
/*学校中心配备一台打印机（可以是黑白打印机，也可以是彩色打印机）。
中心可以通过打印机打印学员的个人信息。通过接口和多态来设计这个程序，
使程序具有更好的扩展性和维护性*/
public class hk14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School school = new School(new Blackandwhiteprinter());
		System.out.println(school.toString());
		school = new School(new Colorprinter());
		System.out.println(school.toString());
	}

}
class School{
	int id;
	String name;
	int score;
	Printer printer;
	public School(Printer printer) {
		super();
		this.printer = printer;
	}
	public School(int id, String name, int score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}
	@Override
	public String toString() {
		return printer.printer()+"School [id=" + id + ", name=" + name + ", score=" + score + "]";
	}
}
interface Printer{
	public String printer();
}
class Blackandwhiteprinter implements Printer{

	@Override
	public String printer() {
		// TODO Auto-generated method stub
		return "黑白打印机";
	}
}
class Colorprinter implements Printer{

	@Override
	public String printer() {
		// TODO Auto-generated method stub
		return "彩色打印机";
	}	
}