package tk;

/*
 * 2006������ѧԱ8���ˣ�ÿ������25%��
 * ���ʰ��������ٶȣ�����һ����ѵѧԱ�������ﵽ20����
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
