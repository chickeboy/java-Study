
public class Test {
	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
		manager.init();
		System.out.println("==========ԭ����==========");
		manager.showAll();
		System.out.println("==========id����==========");
		manager.sortById();
		System.out.println("==========age����==========");
		manager.sortByAge();
	}
}
