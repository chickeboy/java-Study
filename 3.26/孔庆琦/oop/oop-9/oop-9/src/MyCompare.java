import java.util.Comparator;

//Personʵ��Compareableֻ�����һ�������ܣ����Ҫʵ�ֶ����������Ϳ����Լ�������ȥʵ��Comparator�ӿ�
//�߼��͵�һ�ַ�ʽ����
public class MyCompare implements Comparator<Person> {
	// ������һ���������Ƚ���
	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		double res = o2.getScore() - o1.getScore();// ����
		if (res > 0) {
			return 1;
		} else if (res < 0) {
			return -1;
		} else {
			return 0;
		}
	}

}
