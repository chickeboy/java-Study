
public class Test {
	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
		manager.init();
		System.out.println("================原始数据================");
		manager.show();
		manager.sort();
		System.out.println("================排序数据================");
		manager.show();
		manager.write();
		System.out.println("================读取数据================");
		manager.read();
		manager.show();
	}
}
