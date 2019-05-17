package HK6;

import java.util.Arrays;

public class Root {
	Userinformation array[];
	private int size;

	public Root() {
		this(5);
	}

	public Root(int length) {
		array = new Userinformation[length];
	}

	public boolean addroot(Userinformation userinformation) {
		Userinformation user = findByUsername(userinformation.getUsername());//将返回的值赋给user
		//用user的是否为空来判断是否已经有相同的用户名
		System.out.println("这里是addroot方法");//测试是否进入这个方法
		if (user == null) {
			bigger();//扩容方法
			array[size++] = userinformation;
			//System.out.println(size);
			return true;
		}
		return false;
	}

	private void bigger() {
		// TODO Auto-generated method stub
		if (size == array.length) {
			array = Arrays.copyOf(array, size * 2 + 1);
		}
	}

	private Userinformation findByUsername(String username) {
		Userinformation userinformation = null;//初始化userinformation为空
		for (int i = 0; i < size; i++) {
			System.out.println(i);
			if (username.equals(array[i].getUsername())) {//将传进来的username
				//和array数组中的username对比（通过Userinformation中的getusername方法拿到username）
				//如果相同就返回那个用户名，没有相同就返回空说明用户名还没有被创建
				userinformation = array[i];
				break;
			}
		}
		System.out.println(userinformation);
		return userinformation;
	}

	public boolean find(String username, String password) {//传参
		int index = indexOf(username);//用username来判断这个用户名是否存在
		System.out.println("find中的"+index);//测试是否进入find并且查看返回的index值
		if (index == -1) {
			return false;
		} else {//如果找到了用户名判断password是否对应
			return indexOf1(index, password);//如果正确返回true，错误返回false
		}
	}

	private int indexOf(String username) {
		// TODO Auto-generated method stub
		int index = -1;
		System.out.println(size);//测试size是否为0；
		for (int i = 0; i < size; i++) {//将传进来的username
			//和array数组中的username对比（通过Userinformation中的getusername方法拿到username）
			//如果相同就返回那个用户名的下标，没有相同就返回-1说明用户名还没有被创建
			//System.out.println(i);
			if (username.equals(array[i].getUsername())) {
				index = i;
				break;
			}
		}
		return index;
	}

	private boolean indexOf1(int index, String password) {//通过index直接找到array对应的内容与password比较
		// TODO Auto-generated method stub
		System.out.println("indexOf2方法");
		boolean bool = false;
		//System.out.println(size);
		if (password.equals(array[index].getPassword())) {
			System.out.println(array[index].getPassword());//查看找到的内容
			bool = true;
		}
		return bool;
	}

}
