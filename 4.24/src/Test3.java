/*����һ��Worker ����������name age
����һ�����ҽ��ܵ���Ϊ������������е�����
��main�����д������󣬵��ò���*/
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Woker woker = new Woker();
		woker.name = "����";
		woker.out(23);
	}

}
class Woker{
	String name;
	public void out(int age) {
		System.out.println(name+age+"��");
	}
}
