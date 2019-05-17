import java.util.Comparator;

//Person实现Compareable只能完成一种排序功能，如果要实现多种排序规则就可以自己生成类去实现Comparator接口
//逻辑和第一种方式很像
public class MyCompare implements Comparator<Person> {
	// 类似于一个第三方比较器
	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		double res = o2.getScore() - o1.getScore();// 降序
		if (res > 0) {
			return 1;
		} else if (res < 0) {
			return -1;
		} else {
			return 0;
		}
	}

}
