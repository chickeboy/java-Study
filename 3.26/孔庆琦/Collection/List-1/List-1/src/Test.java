
public class Test {
	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
		manager.init();
		manager.show();
		System.out.println("===============ȥ�غ�===============");
		manager.remove();
		manager.show();
	}
}
