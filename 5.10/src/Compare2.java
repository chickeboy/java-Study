import java.util.Comparator;

public class Compare2 implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if (!o1.getName().equals(o2.getName())) {
			return o1.getName().compareTo(o2.getName());
		} else {
			return o1.getScore()-o2.getScore();
		}
		
	}

}
