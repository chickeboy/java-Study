
public class Tk5 {
	public static void main(String[] args) {
		Worker worker = new Worker();
		worker.name = "уехЩ";
		worker.age = 23;
		System.out.println(worker.show());

	}
}

class Worker {
	String name;
	int age;

	public void change() {
		name = "nani";
	}

	public String show() {
		return name + "," + age;
	}
//	public void show() {
//		System.out.println(this.name + "," + age);
//	}
}
