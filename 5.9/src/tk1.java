import java.util.LinkedList;

public class tk1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> arrayList = new LinkedList<String>();
		int i = 0;
		while(i<50) {
			arrayList.add("ƻ��"+(Integer)i+"��");
			i++;
		}
		for (int j = 0;j<50;j++) {
			System.out.println(arrayList.removeFirst());
		}
		System.out.println("==========================");
		i = 0;
		while(i<50) {
			arrayList.add("ƻ��"+(Integer)i+"��");
			i++;
		}
		for (int j = 0;j<50;j++) {
			System.out.println(arrayList.removeLast());
		}
	}

}
