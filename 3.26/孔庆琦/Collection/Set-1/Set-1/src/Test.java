
public class Test {
	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
		manager.init();
		System.out.println("==========Ô­Êı¾İ==========");
		manager.showAll();
		System.out.println("==========idÉıĞò==========");
		manager.sortById();
		System.out.println("==========age½µĞò==========");
		manager.sortByAge();
	}
}
