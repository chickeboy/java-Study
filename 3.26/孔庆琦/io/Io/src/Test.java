
public class Test {
	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
		manager.init();
		System.out.println("================ԭʼ����================");
		manager.show();
		manager.sort();
		System.out.println("================��������================");
		manager.show();
		manager.write();
		System.out.println("================��ȡ����================");
		manager.read();
		manager.show();
	}
}
