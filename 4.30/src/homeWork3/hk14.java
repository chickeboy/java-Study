package homeWork3;
/*ѧУ�����䱸һ̨��ӡ���������Ǻڰ״�ӡ����Ҳ�����ǲ�ɫ��ӡ������
���Ŀ���ͨ����ӡ����ӡѧԱ�ĸ�����Ϣ��ͨ���ӿںͶ�̬������������
ʹ������и��õ���չ�Ժ�ά����*/
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
		return "�ڰ״�ӡ��";
	}
}
class Colorprinter implements Printer{

	@Override
	public String printer() {
		// TODO Auto-generated method stub
		return "��ɫ��ӡ��";
	}	
}