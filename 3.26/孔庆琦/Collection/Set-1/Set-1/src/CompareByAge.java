import java.util.Comparator;

/*
 * �Ƚ�����
 */
public class CompareByAge implements Comparator<Student> {
	// TreeSetҲ�Ǿ���ȥ�ع��ܣ�������ķ���ֵ��0��ʱ�����ͻ��ж�Ϊͬһ������
	// �����age��ͬ��2���˶�ȥ�أ�ȥ��һ����
	@Override
	public int compare(Student o1, Student o2) {
		if (o2.getAge() - o1.getAge() == 0) {
			return 1;// Ҳ���Ǳ�֤2����������Ȼ��ͬ�����ǲ��ᱻ����
		}
		return o2.getAge() - o1.getAge();// ����
	}

}
