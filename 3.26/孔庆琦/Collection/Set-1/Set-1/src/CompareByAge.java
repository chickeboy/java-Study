import java.util.Comparator;

/*
 * 比较器类
 */
public class CompareByAge implements Comparator<Student> {
	// TreeSet也是具有去重功能，当这里的返回值是0的时候，他就会判断为同一个对象
	// 这里把age相同的2个人都去重，去掉一个人
	@Override
	public int compare(Student o1, Student o2) {
		if (o2.getAge() - o1.getAge() == 0) {
			return 1;// 也就是保证2个人年龄虽然相同，但是不会被判重
		}
		return o2.getAge() - o1.getAge();// 降序
	}

}
