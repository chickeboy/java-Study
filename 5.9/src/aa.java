import java.util.ArrayList;
import java.util.LinkedList;

public class aa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				ArrayList<Integer> al = new ArrayList<Integer>();
				long start = System.currentTimeMillis();
				for (int i = 0; i < 100000000; i++) {
					al.add(i);
				}
				long end = System.currentTimeMillis();
				System.out.println("arraylist...." + (end - start));
				LinkedList<Integer> lk = new LinkedList<Integer>();
				start = System.currentTimeMillis();
				for (int i = 0; i < 100000000; i++) {
					lk.add(i);
				}
				end = System.currentTimeMillis();
				System.out.println("linkedlist...." + (end - start));

			}
}
