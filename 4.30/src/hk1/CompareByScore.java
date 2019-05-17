package hk1;

import java.util.Comparator;

public class CompareByScore  implements Comparator<Person>{

	@Override
	public int compare(Person person1, Person person2) {
		
		return person1.getScore() - person2.getScore();
	}
	

}
