package tk;

/*
 * 2006年培养学员8万人，每年增长25%，
 * 请问按此增长速度，到哪一年培训学员人数将达到20万人
 */
public class Tk7 {
	public static void main(String[] args) {
		int year = 2006;
		double people = 8;
		while (people <= 20) {
			people = people * 1.25;
			year++;
		}
		System.out.println(year);
	}
}
