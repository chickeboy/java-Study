package TK1;

import java.io.File;
import java.util.ArrayList;

public class TK1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> arrayList = new ArrayList<Student>();
		File file = new File("D:\\a\\a.txt");
		Manager manager = new Manager(file);
		Util util = new Util();
		util.show(manager.read());
		util.show(manager.read());
	}

}
